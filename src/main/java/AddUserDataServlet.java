import Model.Addresses;
import Model.User;
import Model.UserData;
import Services.AdressService;
import Services.PasswordEncrypter;
import Services.UserDataService;
import Services.UserService;

import javax.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name = "/AddUserDataServlet", urlPatterns = {"/AddUserDataServlet"})
public class AddUserDataServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();

        UserService us = new UserService();

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        String sourname = request.getParameter("sourname");

        int userID=0;
        Cookie ck[] = request.getCookies();
        for (Cookie values: ck
             ) {
            if("idUser".equals(values.getName()))
            {
                userID=Integer.parseInt(values.getValue());
            }
            
        }


        int userId = Integer.parseInt(ck[1].getValue());
        UserData oldUserData = us.getUserDataByUserID(userID);
        UserData newUserData = new UserData(name,sourname,1,userID);

        if(oldUserData==null) {
            us.CreateUserData(newUserData);
            out.println("Pomyslnie dodano dane");
            request.getRequestDispatcher("addUserData.jsp").include(request, response);
            HttpSession session = request.getSession();
            session.invalidate();
        }
        else{
            us.UpdateUserData(userID,newUserData);
            out.println("Pomyslnie zaktualizowano dane");
            request.getRequestDispatcher("addUserData.jsp").include(request, response);
            HttpSession session = request.getSession();
            session.invalidate();


        }




    }
}
