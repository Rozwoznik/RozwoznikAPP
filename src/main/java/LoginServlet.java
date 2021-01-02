import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
        PrintWriter out=response.getWriter();
        request.getRequestDispatcher("link.html").include(request, response);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://25.43.228.156:3306/rozwoznik", "kacper", "admin");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        String query = "SELECT * FROM User;";

        // create the mysql insert preparedstatement
        try {
            PreparedStatement preparedStmt = connection.prepareStatement(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        String password=request.getParameter("password");
        PreparedStatement preparedStmt = null;
        
        if(password.equals("admin123")){
            try {
                preparedStmt = connection.prepareStatement(query);
                preparedStmt.executeQuery();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            out.print("Welcome, "+preparedStmt);
            HttpSession session=request.getSession();
            session.setAttribute("name",query.toString());
        } else{
            out.print("Sorry, username or password error!");
            request.getRequestDispatcher("login.jsp").include(request, response);
        }
        out.close();
    }
}  