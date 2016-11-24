package unit10.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

@WebServlet("/user/authorise")
public class AuthoriseController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");

        final User user = new UserBean();
        user.setFirstName(req.getParameter("firstName"));
        user.setLastName(req.getParameter("lastName"));
        user.setRoles(Arrays.asList("reader", "author", "admin"));
//        user.setDate(new Date());
        req.setAttribute("user", user);

        req.getRequestDispatcher("/WEB-INF/user/authorise.jsp")
                .forward(req, resp);
    }
}
