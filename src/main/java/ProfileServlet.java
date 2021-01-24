import java.io.IOException;
import java.io.PrintWriter;
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

        Cookie ck[] = request.getCookies();
        request.getRequestDispatcher("Links/logedLink.html").include(request, response);
        if (ck != null) {
            if (ck.length != 2) {
                out.print("<link rel=\"stylesheet\" href=\"CSS/main.css\">");
                out.print("<b>Welcome to Profile:  </b>");
                out.print("<b>" + ck[2].getValue() + "</b><br>");
                out.print("<b>ID : "+ck[3].getValue());
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