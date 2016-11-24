package unit10;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/redirect")
public class RedirectToBooks extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/book/books.jsp");
        dispatcher.forward(req, resp);
        dispatcher.forward(req, resp);
//        resp.sendRedirect("https://lmgtfy.com/?q=How+to+do+something");
    }

}
