import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.sql.*;

@WebServlet(name = "/dane" , urlPatterns = {"/dane"})
public class dane extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String dana = request.getParameter("column");
        String tabela = request.getParameter("table");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("****", "****", "****");
            String command = "SELECT "+dana+ " FROM "+"`"+tabela+"`";
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(command);

            while(rs.next()) {
                response.getWriter().println(rs.getString(1));
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
