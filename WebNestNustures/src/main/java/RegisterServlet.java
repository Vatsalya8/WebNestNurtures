import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("t1");
        String password = request.getParameter("t2");
        String email = request.getParameter("t3");
        String mobile = request.getParameter("t4");
        String gender = request.getParameter("r1");
        String[] languages = request.getParameterValues("c1[]");
        String dob = request.getParameter("s1");
        String address = request.getParameter("txt1");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1>Registration Successful</h1>");
        out.println("<p>Welcome, " + name + "</p>");
        out.close();
    }
}
