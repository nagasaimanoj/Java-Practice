import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.mail.*;
import javax.activation.*;
import java.sql.*;

public class mail extends HttpServlet {

   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      System.getProperties().setProperty("mail.smtp.host", "localhost");
      try {
         javax.mail.internet.MimeMessage message = new javax.mail.internet.MimeMessage(Session.getDefaultInstance(properties));
         message.setFrom(new InternetAddress("dd.nayagam95@gmail.com"));
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(request.getParameter("email")));
         message.setSubject("This is the Subject Line!");
         message.setText("This is actual message");
         Transport.send(message);

         response.getWriter().println("<html><body><h1>Message Successfully Sent");
      } catch (Exception e) {
          e.printStackTrace();
      }
      try{
          Class.forName("com.mysql.jdbc.Driver");
          PreparedStatement ps = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventreg", "root", "").prepareStatement("insert into eventreg values(?,?,?,?,?,?,?)");
          ps.setString(1,request.getParameter("firstname"));  
          ps.setString(2,request.getParameter("lastname"));
          ps.setString(3,request.getParameter("email")); 
          ps.setString(4,request.getParameter("date"));  
          ps.setString(5,request.getParameter("time"));  
          ps.setString(6,request.getParameter("topic")); 
          ps.setString(7,request.getParameter("location"));
          
          if(ps.executeUpdate()>0){
              response.getWriter().print("You are successfully Completed the Event Registration...");
          }else{
              response.getWriter().print("Something seems wrong");
          }
        }catch (Exception e) {
          e.printStackTrace();
        }
    }
}