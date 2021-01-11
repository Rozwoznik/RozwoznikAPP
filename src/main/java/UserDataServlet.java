
import Model.Addresses;
import Model.User;
import Model.UserData;
import Services.AdressService;
import Services.UserDataService;
import Services.UserService;


import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "/UserDataServlet", urlPatterns = {"/UserDataServlet"})
public class UserDataServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();

        AdressService ads = new AdressService();
        UserService us = new UserService();

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");

        Addresses address = ads.getAddressByUserID(4);

        if(address!=null) {

            request.setAttribute("street", address.getStreet());
            request.setAttribute("houseNumber", address.getHouseNumber());
            request.setAttribute("zipCode", address.getZipcode());
            request.setAttribute("city", address.getCity());
            request.setAttribute("validData","Twój Adres: ");

        }
        else{
            request.setAttribute("street", " ");
            request.setAttribute("houseNumber", " ");
            request.setAttribute("zipCode", " ");
            request.setAttribute("city", " ");
            request.setAttribute("validAddress","Jeszcze nie podałeś adresu");
        }


        UserData userData = us.getUserDataByUserID(4);

        if(userData!=null) {

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

