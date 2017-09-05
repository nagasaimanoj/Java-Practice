import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import java.io.IOException;

@WebServlet("/sendmessage")
public class SendMessage extends HttpServlet {
    static final long serialVersionUID = 1L;
    private String sender;
    private String reciever;
    private String sentMessage;
    private boolean isSuccess;
    private RequestDispatcher rd;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        sender = request.getParameter("sender");
        reciever = request.getParameter("reciever");
        sentMessage = request.getParameter("sentmessage");

        try {
            isSuccess = DbConnect.runQuery("insert into messages_table(sender,reciever,sentmessage) values('" + sender
                    + "','" + reciever + "','" + sentMessage + "');");
        } catch (Exception ex) {
        }

        if (isSuccess) {
            rd = request.getRequestDispatcher("index");
            rd.forward(request, response);
        } else {
            response.getWriter().println("message sending failed");
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        rd = request.getRequestDispatcher("index");
        rd.forward(request, response);
    }
}