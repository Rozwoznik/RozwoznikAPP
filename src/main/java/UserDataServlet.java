
import Model.Addresses;
import Model.User;
import Model.UserData;
import Services.AdressService;
import Services.UserDataService;
import Services.UserService;

import javax.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name = "/UserDataServlet", urlPatterns = {"/UserDataServlet"})
public class UserDataServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();

        AdressService ads = new AdressService();
        UserService us = new UserService();

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        int userID = -1;
       Cookie ck[] = request.getCookies();

        for (Cookie c:ck
             ) {
            if("idUser".equals(c.getName()))
            {
               userID = Integer.parseInt(c.getValue());
            }
        }

        Addresses address = ads.getAddressByUserID(20);

        if(address!=null) {

            request.setAttribute("street", address.getStreet());
            request.setAttribute("houseNumber", address.getHouseNumber());
            request.setAttribute("zipCode", address.getZipcode());
            request.setAttribute("city", address.getCity());
            request.setAttribute("validAddress","Twój Adres: ");

        }

        else{
            request.setAttribute("street", " ");
            request.setAttribute("houseNumber", " ");
            request.setAttribute("zipCode", " ");
            request.setAttribute("city", " ");
            request.setAttribute("validAddress","Jeszcze nie podałeś adresu");
        }

        UserData userData = us.getUserDataByUserID(userID);

        if(userID!=-1) {

            request.setAttribute("name", userData.getName());
            request.setAttribute("sourname", userData.getSourname());
            request.setAttribute("validData","Twoje Dane: ");
        }

        else{
            request.setAttribute("name", "Uzupelnij imie");
            request.setAttribute("sourname", "Uzupelnij nazwisko");
            request.setAttribute("validData","Jeszcze nie podałeś swoich danych");
        }

        request.getRequestDispatcher("wypiszDane.jsp").include(request, response);
            HttpSession session = request.getSession();
            session.invalidate();
        }
    }

