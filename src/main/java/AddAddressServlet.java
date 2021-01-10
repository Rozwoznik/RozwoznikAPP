import Model.Addresses;
import Model.User;
import Services.AdressService;
import Services.PasswordEncrypter;
import Services.UserDataService;

import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "/AddAddressServlet", urlPatterns = {"/AddAddressServlet"})
public class AddAddressServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
       AdressService ads = new AdressService();
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");

        String street = request.getParameter("street");
        String houseNumber = request.getParameter("houseNumber");
        String zipCode = request.getParameter("zipCode");
        String city = request.getParameter("city");


         if (!zipCode.matches("^[0-9]{2}(?:-[0-9]{3})?$")) {
            out.print("Kod pocztowy nie  jest poprawny ze schematem");
             out.println("<html><body>");
             out.println("<h1>My HTML Body</h1>");
             out.println("</body></html>");
            request.getRequestDispatcher("addAddress.jsp").include(request, response);
        } else {

            Addresses adress = new Addresses(street,houseNumber,zipCode,city);
            ads.CreateAddress(adress);
            request.getRequestDispatcher("Links/link.html").include(request, response);
            HttpSession session = request.getSession();
            session.invalidate();
        }
    }
}
