import Services.DatabaseService;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "/ShowProfileServlet", urlPatterns = {"/ShowProfileServlet"})

public class ShowProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();


        Cookie ck[] = request.getCookies();

        if (ck != null)
            request.getRequestDispatcher("profil.jsp").include(request, response);
         else   {
                out.print("Musisz być zalogowany aby zobaczyć swój profil !!");
                request.getRequestDispatcher("login.jsp").include(request, response);
                }

        out.close();
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}