import Services.DatabaseService;
import Services.PasswordEncrypter;
import Services.UserDataService;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "/Login", urlPatterns = {"/Login"})
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("link.html").include(request, response);

        String nickname = request.getParameter("name");
        String password = request.getParameter("password");

        UserDataService uds = new UserDataService();
        PasswordEncrypter pe = new PasswordEncrypter();

        String passwd = uds.getUserPasswordByUserName(nickname);

        if (passwd.equals(pe.Encrypt(password))) {
            Cookie ck = new Cookie("name",nickname);
            response.addCookie(ck);
        } else {
            out.print("Bledny login lub haslo!");
            request.getRequestDispatcher("login.jsp").include(request, response);
        }
        out.close();
    }
}  