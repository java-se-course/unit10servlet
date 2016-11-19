package unit10;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/other_controller")
public class OtherController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String name = req.getParameter("name");
        resp.setContentType("text/html");
        final PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h2>Other controller</h2>");
        out.println("<h3>Hi, " + name + "!</h3>");
        out.println("</body>");
        out.println("</html>");
    }

}
