import Services.DatabaseService;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "/ProfileServlet", urlPatterns = {"/ProfileServlet"})
public class ProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("Links/logedLink.html").include(request, response);

        Cookie ck[] = request.getCookies();
        if (ck != null) {
            if (ck.length != 1) {
                out.print("<b>Welcome to Profile:  </b>");
                out.print("<b>" + ck[0].getValue() + "</b><br>");
                String query = "SELECT * FROM `Advertisement`";
                ResultSet rs = DatabaseService.executeQuery(query);
                out.print("Produkty: <br>");
                try {
                    while(rs.next()) {
                        out.print("ID: "+rs.getInt(1)+"");
                        out.print("  Nazwa produktu: "+rs.getString(2) + "<br>");
                    }
                } catch (SQLException sqlException) {
                    System.out.println(sqlException);
                }

            } else {
                out.print("Please login first");
                request.getRequestDispatcher("login.jsp").include(request, response);
            }
        }
        out.close();
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}