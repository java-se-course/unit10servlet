package unit10;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/controller", asyncSupported = true)
public class Controller extends HttpServlet {

    private int count;

    private void longAsyncTask(final AsyncContext ac) {
        new Thread() {
            @Override
            public void run() {
                final ServletResponse resp = ac.getResponse();
                final ServletRequest req = ac.getRequest();

                resp.setContentType("text/html");

                final PrintWriter out;
                try {
                    out = resp.getWriter();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                out.println("<html>");
                out.println("<body>");
                out.println("<h2>Hi from async Controller!</h2>");
                out.println("<div>Count: " + (count++) + "</div>");
                out.println("<div>A: " + req.getParameter("a") + "</div>");
//                out.println("<div>Query: " + req.getQueryString() + "</div>");
                out.println("</body>");
                out.println("</html>");

                ac.complete();
            }
        }.start();
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        final AsyncContext asyncContext = req.startAsync();


        longAsyncTask(asyncContext);
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
