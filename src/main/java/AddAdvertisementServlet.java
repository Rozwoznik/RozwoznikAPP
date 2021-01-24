import Model.Advertisement;
import Services.AdvertisementService;
import Services.DatabaseService;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "/AddAdvertisement", urlPatterns = {"/AddAdvertisement"})
public class AddAdvertisementServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        Cookie ck[] = request.getCookies();

        if (ck != null) {
            if (ck.length != 2) {
                String nazwa = request.getParameter("name");
                int kategoria = Integer.parseInt(request.getParameter("category"));
                String opis = request.getParameter("description");
                String cena = request.getParameter("price");
                String dataDodania = addDate();
                String dataKonca = request.getParameter("datePicker");
                int ktoDodal = Integer.parseInt(ck[2].getValue());

                Advertisement adv = new Advertisement(nazwa, kategoria, cena, opis, dataDodania, dataKonca, ktoDodal, 0);
                AdvertisementService as = new AdvertisementService();
                as.CreateAdvertisement(adv);
                response.sendRedirect("/Advertisement");
                out.close();
            }
        } else {
            response.sendRedirect("login.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        Cookie ck[] = request.getCookies();
        out.print(ck[2].getValue());

    }

    private String addDate(){
        String date="";
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        date = simpleDateFormat.format(new Date());

        return date;
    }
}