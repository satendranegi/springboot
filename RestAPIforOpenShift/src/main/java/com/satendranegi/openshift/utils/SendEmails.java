/**
 * 
 */
package com.satendranegi.openshift.utils;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.activation.*;

/**
 * @author SatendraNegi
 *
 */
public class SendEmails {
	
	public boolean sendEmail(String Message) {
		
		// Recipient's email ID needs to be mentioned.
	      String to = "satendranegi1989@gmail.com";

	      // Sender's email ID needs to be mentioned
	      String from = "iamnegii@gmail.com";

	      // Assuming you are sending email from localhost
	      String host = "smtp.gmail.com";

	      // Get system properties
	      Properties properties = System.getProperties();
	      properties.setProperty("mail.user", "satendranegi1989@gmail.com");
	      properties.setProperty("mail.password", "saru@9458131138");

	      // Setup mail server
	      properties.setProperty("mail.smtp.host", host);
	      properties.setProperty("mail.smtp.starttls.enable", "true");

	      // Get the default Session object.
	      Session session = Session.getDefaultInstance(properties);

	      try {
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

	         // Set To: header field of the header.
	         message.addRecipient(RecipientType.TO, new InternetAddress(to));

	         // Set Subject: header field
	         message.setSubject("This is the Subject Line!");

	         // Now set the actual message
	         message.setText("This is actual message");

	         // Send message
	         Transport.send(message);
	         System.out.println("Sent message successfully....");
	      } catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
	   
		
		return true;
	}

}
