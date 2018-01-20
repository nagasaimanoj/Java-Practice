import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletException;
import java.io.IOException;

@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("message", "service input - " + request.getParameter("username"));
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}