@javax.servlet.annotation.WebServlet("/hello")
public class HelloWorld extends javax.servlet.http.HttpServlet {
    public void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException{
        response.getWriter().println("<h1>welcome " + request.getParameter("username"));
    }
}