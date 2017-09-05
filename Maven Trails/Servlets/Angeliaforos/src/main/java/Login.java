import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import java.io.IOException;

@WebServlet("/login")
public class Login extends HttpServlet {
    static final long serialVersionUID = 1L;
    private RequestDispatcher rd = null;
    private String username;
    private String userpass;
    private boolean isValid = false;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        username = request.getParameter("uname");
        userpass = request.getParameter("upass");

        try {
            isValid = DbConnect.userValidate(username, userpass);
        } catch (Exception ex) {
        }

        if (isValid) {
            rd = request.getRequestDispatcher("friends");
        } else {
            rd = request.getRequestDispatcher("index");
        }

        rd.forward(request, response);

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        rd = request.getRequestDispatcher("index");
        rd.forward(request, response);
    }
}