import Model.Addresses;
import Model.User;
import Services.AdressService;
import Services.PasswordEncrypter;
import Services.UserDataService;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

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

            Addresses oldAdress = ads.getAddressByUserID(4);

            Addresses newAdress = new Addresses(street,houseNumber,zipCode,city);

               if(oldAdress!=null){
                   out.println("Juz jest twoj adres");
                   ads.updateAddress(newAdress,"10");
                   request.getRequestDispatcher("UserDataServlet").include(request, response);
                   HttpSession session = request.getSession();
                   session.invalidate();
               }
                else if (!zipCode.matches("^[0-9]{2}(?:-[0-9]{3})?$")) {
                   out.print("Kod pocztowy nie  jest poprawny ze schematem");
                   request.getRequestDispatcher("AddAddressServlet").include(request, response);
               }

                else if(!houseNumber.matches("^\\d+[a-zA-Z]*$"))
                    {
                        out.print("Nr domu nie jest poprawny");
                        request.getRequestDispatcher("AddAddressServlet").include(request, response);
                    }

                    else{
            ads.CreateAddress(newAdress);
            out.println("Pomyślnie dodano adres");
            request.getRequestDispatcher("UserDataServlet").include(request, response);
            HttpSession session = request.getSession();
            session.invalidate();
        }

    }
}
