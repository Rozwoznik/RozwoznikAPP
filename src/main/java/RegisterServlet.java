import Services.PasswordEncrypter;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import static java.sql.Types.NULL;

@WebServlet(name = "/RegisterServlet", urlPatterns = {"/RegisterServlet"})
public class RegisterServlet extends HttpServlet{

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            String nick = request.getParameter("nick");
            String pass = request.getParameter("pass");
            String repass = request.getParameter("repass");
            PasswordEncrypter passwordEncrypter = new PasswordEncrypter();
            String email = request.getParameter("email");
            if (!pass.equals(repass)) {
                response.getWriter().println("Hasła się nie zgadzają");
            } else {
                Connection connection = DriverManager.getConnection("jdbc:mysql://25.43.228.156:3306/rozwoznik", "kacper", "admin");
                String query = " insert into User (`idUser`, `Username`, `Password`, `Email`)"
                        + " values (?, ?, ?, ?)";

                // create the mysql insert preparedstatement
                PreparedStatement preparedStmt = connection.prepareStatement(query);
                preparedStmt.setInt(1, NULL);
                preparedStmt.setString(2, nick);
                preparedStmt.setString(3, passwordEncrypter.Encrypt(pass));
                preparedStmt.setString(4, email);

                // execute the preparedstatement
                preparedStmt.execute();

                connection.close();
            }
            } catch(SQLException throwables){
                throwables.printStackTrace();
            }

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            request.getRequestDispatcher("link.html").include(request, response);

            HttpSession session = request.getSession();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}

