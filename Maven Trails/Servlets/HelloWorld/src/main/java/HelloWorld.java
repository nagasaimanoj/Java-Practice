import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
    private static final long serialVersionUID = 1L; //to avoid a warning

    public void init() {
        System.out.println("init() called");
    }

    // public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    //     System.out.println("service() called");
    //     request.setAttribute("message", "service input - " + request.getParameter("username"));
    //     request.getRequestDispatcher("index.jsp").forward(request, response);
    // }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("doPost() called");
        request.setAttribute("message", "post input " + request.getParameter("username"));
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("doGet() called");
        //response.getOutputStream().println("doGet() called");
        request.setAttribute("message", "get input " + request.getParameter("username"));
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    public void destroy() {
        System.out.println("destroy() called");
    }
}