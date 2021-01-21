import Services.AdvertisementService;
import Services.DatabaseService;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "/AdvertisementServlet", urlPatterns = {"/Advertisement"})
public class AdvertisementServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        Cookie ck[] = request.getCookies();

        String kasujBtn = "<th> <button name=\"kasacja\" type=\"submit\" >KASUJ</button></th>";

        String query = "SELECT * FROM `Advertisement`";
        ResultSet rs = DatabaseService.executeQuery(query);

        out.print("<link rel=\"stylesheet\" href=\"CSS/AdvertisementStyle.css\">");
        out.print("<table style=\"width:100%\">");
        out.print("<tr>" +
                "    <th>ID</th>" +
                "    <th>Nazwa</th> " +
                "    <th>Kategoria</th>" +
                "    <th>Cena</th>" +
                "    <th>Kiedy dodane</th>" +
                "    <th>Kto dodal</th>" +
                "    <th>Usun ogloszenie</th>" +
                "</tr>");
        try {
            while (rs.next()) {
                out.print("<tr>");
                out.print("<th>" + rs.getInt(1) + "</th>");
                out.print("<th>" + rs.getString(2) + "</th>");
                out.print("<th>" + rs.getString(3) + "</th>");
                out.print("<th>" + rs.getString(4) + "</th>");
                out.print("<th>" + rs.getString(6) + "</th>");
                out.print("<th>" + rs.getString(8) + "</th>");
                out.print(kasujBtn);
                out.print("</tr>");
            }
            out.print("</table>");
        } catch (SQLException sqlException) {
            System.out.println(sqlException);
        }

        out.close();
    }

    public void kasuj(int id){
        AdvertisementService ad = new AdvertisementService();
        ad.deleteAdvertisement(id);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

}


