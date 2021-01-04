import Services.DatabaseService;
import Services.PasswordEncrypter;
import Services.UserDataService;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
            out.print("Welcome, " + nickname);
            HttpSession session = request.getSession();
            session.setAttribute("username", nickname);
        } else {
            out.print("Sorry, username or password error!");
            request.getRequestDispatcher("login.jsp").include(request, response);
        }
        out.close();
    }
}  