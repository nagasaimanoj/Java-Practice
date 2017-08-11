import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import java.sql.*;

@webServlet("/mail") 
public class mail extends HttpServlet {
    static Connection conn = null;

   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String fn= request.getParameter("firstname");
      String ln= request.getParameter("lastname");
      String date= request.getParameter("date");
      String time= request.getParameter("time");
      String topic= request.getParameter("topic");
      String location= request.getParameter("location");
      String to=request.getParameter("email");
      String from = "dd.nayagam95@gmail.com";


      String host = "localhost";
      Properties properties = System.getProperties();
      properties.setProperty("mail.smtp.host", host);

      Session session = Session.getDefaultInstance(properties);
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
      try {
         MimeMessage message = new MimeMessage(session);
         message.setFrom(new InternetAddress(from));
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
         message.setSubject("This is the Subject Line!");
         message.setText("This is actual message");
         Transport.send(message);
         String title = "Send Email";
         String res = "Sent message successfully....";
         String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">";
         
         out.println(docType + "<html><head><title>" + title + "</title></head>"
         +"<body bgcolor = \"#f0f0f0\">"
         +"<h1 align = \"center\">"+ title + "</h1>"
         +"<p align = \"center\">" + res + "</p></body></html>");
      } catch (MessagingException mex) {
         mex.printStackTrace();
      }

try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/eventreg", "root", "");  
  
PreparedStatement ps=con.prepareStatement(  
"insert into eventreg values(?,?,?,?,?,?,?)");  
  
ps.setString(1,fn);  
ps.setString(2,ln);
 ps.setString(3,email); 
ps.setString(4,date);  
ps.setString(5,time);  
ps.setString(6,topic); 
ps.setString(7,location); 
 
          
int i=ps.executeUpdate();  
if(i>0)  
out.print("You are successfully Completed the Event Registration...");  
      
          
}catch (Exception e2) {System.out.println(e2);}  
          
   
   }
} 