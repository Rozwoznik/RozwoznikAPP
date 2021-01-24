import Model.Advertisement;
import Services.AdvertisementService;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "/addAdvertisement", urlPatterns = {"/addAdvertisement"})
public class AddAdvertisementServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        Cookie ck[] = request.getCookies();
        AdvertisementService ads = new AdvertisementService();

        if (ck.length != 1) {
            request.getRequestDispatcher("Links/logedLink.html").include(request, response);
        } else {
            request.getRequestDispatcher("Links/link.html").include(request, response);
        }

        String name = request.getParameter("name");
        String category = request.getParameter("category");
        String price = request.getParameter("price");
        String description = request.getParameter("description");
        String endDate = request.getParameter("datepicker");
        LocalDateTime dateObj = LocalDateTime.now();
        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        Advertisement adv = new Advertisement(name, 2, price, description, formatObj.format(dateObj) ,endDate.toString(),1,1);
        ads.CreateAdvertisement(adv);

        response.sendRedirect("/AdvertisementServlet");
        out.close();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}