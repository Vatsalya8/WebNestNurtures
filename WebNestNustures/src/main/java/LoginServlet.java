import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("t1");
        String password = request.getParameter("t2");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if ("admin".equals(name) && "password".equals(password)) {
            out.println("<h1>Login Successful</h1>");
            out.println("<p>Welcome, " + name + "</p>");
        } else {
            out.println("<h1>Invalid Credentials</h1>");
            out.println("<a href='login.html'>Try Again</a>");
        }
        out.close();
    }
}
