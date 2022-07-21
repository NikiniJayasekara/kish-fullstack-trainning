import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
 
public class SendEmail extends HttpServlet {

   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      String to = "abcd@gmail.com";
      String from = "web@gmail.com";
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
         String docType =
            "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
         
         out.println(docType +
            "<html>\n" +
               "<head><title>" + title + "</title></head>\n" +
               "<body bgcolor = \"#f0f0f0\">\n" +
                  "<h1 align = \"center\">" + title + "</h1>\n" +
                  "<p align = \"center\">" + res + "</p>\n" +
               "</body>
            </html>"
         );
      } catch (MessagingException mex) {
         mex.printStackTrace();
      }
   }
}