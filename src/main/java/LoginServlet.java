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
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        String nickname = request.getParameter("name");
        String password = request.getParameter("password");
        String idUser;

        UserDataService uds = new UserDataService();
        PasswordEncrypter pe = new PasswordEncrypter();

        String passwd = uds.getUserPasswordByUserName(nickname);

        if (passwd.equals(pe.Encrypt(password))) {
            idUser = uds.getUserIdByNickname(nickname);
            Cookie ck[] = {new Cookie("name",nickname),new Cookie("idUser", idUser)};
            for (Cookie c: ck) {
                response.addCookie(c);
            }

            response.sendRedirect("/ProfileServlet");
        } else {
            out.print("Bledny login lub haslo!");
            request.getRequestDispatcher("login.jsp").include(request, response);
        }
        out.close();
    }
}  