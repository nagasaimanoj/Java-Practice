@javax.servlet.annotation.WebServlet("/hello")
public class HelloWorld extends javax.servlet.http.HttpServlet {
    public void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException{
<<<<<<< HEAD
        if(request.getParameter("username").equals("manoj")){
            request.setAttribute("message","welcome");
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }else{
            request.setAttribute("message","error");
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }
=======
        response.getWriter().println("<h1>welcome " + request.getParameter("username"));
>>>>>>> 33b134ffcfd6c8fe383a437bb67eba133b4b2029
    }
}