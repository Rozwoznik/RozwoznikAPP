import Model.User;
import Services.PasswordEncrypter;
import Services.UserDataService;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "/RegisterServlet", urlPatterns = {"/RegisterServlet"})
public class RegisterServlet extends HttpServlet{

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PasswordEncrypter pe = new PasswordEncrypter();
        PrintWriter out=response.getWriter();
        UserDataService uds = new UserDataService();
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");

        String nick = request.getParameter("nick");
        String pass = request.getParameter("pass");
        String repass = request.getParameter("repass");
        String email = request.getParameter("email");

        if(uds.existUserInDatabase(nick)){
            out.print("Podana nazwa uzytkownika jest juz zajeta...");
            request.getRequestDispatcher("register.jsp").include(request, response);
        } else if(!pass.equals(repass)){
            out.print("Podane hasla nie są takie same...");
            request.getRequestDispatcher("register.jsp").include(request, response);
        } else if (!email.matches("^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$")) {
            out.print("Adres email jest bledny...");
            request.getRequestDispatcher("register.jsp").include(request, response);
        } else {
            User user = new User(nick, pe.Encrypt(pass), email);
            uds.CreateUser(user);
            request.getRequestDispatcher("link.html").include(request, response);
            HttpSession session = request.getSession();
            session.invalidate();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}

