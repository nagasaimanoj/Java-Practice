import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import java.sql.*;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@WebServlet("/JavaEmailServlet")
public class JavaEmailServlet extends HttpServlet {

    Properties emailProperties;
    Session mailSession;
    MimeMessage emailMessage;
    Transport transport = null;
    JavaEmailServlet javaEmail = null;

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String toMail = request.getParameter("email");
        //String password = request.getParameter("password");
        try {
            javaEmail = new JavaEmailServlet();
            javaEmail.setMailServerProperties();
            javaEmail.createEmailMessage(toMail);
            javaEmail.sendEmail();
            out.println("Process Completed\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendEmail() throws AddressException, MessagingException {
        try {
            String emailHost = "smtp.zoho.com";
            String fromUser = "nagasai.g9@zoho.com";
            String fromUserEmailPassword = "Porsche.G9";

            transport = mailSession.getTransport("smtp");

            transport.connect(emailHost, fromUser, fromUserEmailPassword);
            transport.sendMessage(emailMessage, emailMessage.getAllRecipients());
            transport.close();
            System.out.println("sendEmail() runned\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createEmailMessage(String toEmails) throws AddressException, MessagingException {
        try {
            String emailSubject = "Java Servlet Mail TestRun";
            String emailBody = "this is to notify tht U are reading this mail";

            mailSession = Session.getDefaultInstance(emailProperties, null);
            emailMessage = new MimeMessage(mailSession);
            emailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmails));

            emailMessage.setSubject(emailSubject);
            emailMessage.setContent(emailBody, "text/html");//for a html email
            System.out.println("createEmailMessage() runned\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setMailServerProperties() {
        try {
            emailProperties = System.getProperties();
            emailProperties.put("mail.smtp.port", "587");
            emailProperties.put("mail.smtp.auth", "true");
            emailProperties.put("mail.smtp.socketFactory.port", "465");
            emailProperties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            emailProperties.put("mail.smtp.starttls.enable", "true"); //access of client host
            emailProperties.put("mail.transport.protocol", "smtp");
            emailProperties.put("mail.smtp.ssl.enable", "true");
            emailProperties.put("mail.smtp.host", "smtp.zoho.com");
            System.out.println("setMailServerProperties() runned\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}