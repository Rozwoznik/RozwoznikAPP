import Services.AdvertisementService;
import Services.DatabaseService;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "/AdvertisementServlet", urlPatterns = {"/AdvertisementServlet"})
public class AdvertisementServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {


        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        Cookie ck[] = request.getCookies();


        String query = "SELECT * FROM `Advertisement`";
        ResultSet rs = DatabaseService.executeQuery(query);

        List<String> allAdvertisementList = new ArrayList<>();

        try {
            while (rs.next()) {

               String name= rs.getString(2) ;
               String price = rs.getString(4) ;
               String description=rs.getString(5) ;
               String createDate=rs.getString(6) ;

               allAdvertisementList.add("Nazwa : "+ name+ " cena: "+price+ " opis:  "+ description+ " data utworzenia: "+ createDate);
            }

        } catch (SQLException sqlException) {
            System.out.println(sqlException);
        }

        request.setAttribute("allAdvertisement", allAdvertisementList);

        request.getRequestDispatcher("wszystkieOgloszenia.jsp").include(request, response);
        HttpSession session = request.getSession();
        session.invalidate();
    }

    //public void kasuj(int id) {
   //     AdvertisementService ad = new AdvertisementService();
   //     ad.deleteAdvertisement(id);
  //  }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

}


