import Services.DatabaseService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "/FindAdvertisementServlet", urlPatterns = {"/FindAdvertisement"})
public class FindAdvertisementServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        Cookie ck[] = request.getCookies();
        int numerKategorii = Integer.parseInt(request.getParameter("category"));

        String query = String.format("Select Advertisement.*, (SELECT Categories.Category FROM `Categories` WHERE idCategory=%d) AS Category, (SELECT User.Username FROM `User` WHERE User.idUser=Advertisement.User_idUser) AS WhoAdd FROM Advertisement WHERE Category=%d",numerKategorii,numerKategorii);
        ResultSet rs = DatabaseService.executeQuery(query);
        out.print("<link rel=\"stylesheet\" href=\"CSS/AdvertisementStyle.css\">");
        out.print("<table style=\"width:100%\">");
        out.print("<tr>" +
                "    <th>ID</th>" +
                "    <th>Nazwa</th> " +
                "    <th>Kategoria</th>" +
                "    <th>Cena</th>" +
                "    <th>Kiedy dodane</th>" +
                "    <th>Kto dodał</th>" +
                "</tr>");
        try {
            while (rs.next()) {
                out.print("<tr>");
                out.print("<th>" + rs.getInt(1) + "</th>");
                out.print("<th>" + rs.getString(2) + "</th>");
                out.print("<th>" + rs.getString(10) + "</th>");
                out.print("<th>" + rs.getString(4) + "</th>");
                out.print("<th>" + rs.getString(6) + "</th>");
                out.print("<th>" + rs.getString(11) + "</th>");
                out.print("</tr>");
            }
            out.print("</table>");
        } catch (SQLException sqlException) {
            System.out.println(sqlException);
        }
        out.close();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}