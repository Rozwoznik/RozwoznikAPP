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
        PrintWriter out=response.getWriter();
        request.getRequestDispatcher("Links/logedLink.html").include(request, response);

        Cookie ck[]=request.getCookies();
        if(ck!=null){
            Cookie name=ck[1];
            if(name.getName()=="name" && !name.getValue().equals("")){
                out.print("<b>Welcome to Profile</b><br><br>");
                for (Cookie c: ck) {
                    out.print("Name: "+c.getName()+" Value: "+c.getValue()+"<br>");
                }
            } else{
                out.print("Please login first");
                request.getRequestDispatcher("login.jsp").include(request, response);
            }
        }
        out.close();
    }
}  