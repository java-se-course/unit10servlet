package unit10;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.SessionCookieConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/controller")
public class Controller extends HttpServlet {

    private int count;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        final PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h2>Hi from Controller</h2>");
        out.println("<div>Count: " + (count++) + "</div>");
        out.println("<div>A: " + req.getParameter("a") + "</div>");
        out.println("<div>Query: " + req.getQueryString() + "</div>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String name = req.getParameter("name");
        resp.setContentType("text/html");
        final PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h2>Hi, " + name + "!</h2>");
        out.println("<div>Count: " + (count++) + "</div>");
        out.println("<div>Query: " + req.getQueryString() + "</div>");
        out.println("</body>");
        out.println("</html>");
    }
}
