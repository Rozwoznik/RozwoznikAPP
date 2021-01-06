import Services.PasswordEncrypter;
import Services.UserDataService;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "/AddAdvertisementServlet", urlPatterns = {"/AddAdvertisementServlet"})
public class AddAdvertisementServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("Links/logedLink.html").include(request, response);


        HttpSession session=request.getSession(false);
        if(session!=null) {

        }


        out.close();
    }
}