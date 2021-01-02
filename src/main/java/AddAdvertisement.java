import Model.Advertisement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;


@WebServlet(name = "/addAdvertisement" , urlPatterns = {"/addAdvertisement"})
public class AddAdvertisement extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String category = request.getParameter("name");
        String price = request.getParameter("name");
        String description = request.getParameter("name");

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://25.43.228.156:3306/rozwoznik", "kacper", "admin");
            String command = "INSERT INTO `Advertisement` (`idAdvertisement`, `Name`, `Category`, `Price`, `Description`, `CreateDate`, `FinishDate`, `User_idUser`, `Archive_idUserFinish`) VALUES (?,?,?,?,?,?,?,?,?);";
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(command);
            rs.updateString(0, null);
            rs.updateString(1, name.toString());
            rs.updateString(2, category.toString());
            rs.updateString(3,price.toString());
            rs.updateString(4,description.toString());
            rs.updateDate(5, java.sql.Date.valueOf(date));
            rs.updateDate(6, null);
            rs.updateInt(7, 10);
            rs.updateInt(8,1);

            response.getWriter().println("Wykonano");
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response){

    }
}