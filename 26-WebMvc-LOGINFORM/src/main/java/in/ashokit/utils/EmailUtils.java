package in.ashokit.utils;

import org.apache.logging.log4j.message.SimpleMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.internet.MimeMessage;

@Component
public class EmailUtils {
	
}
	
//@Autowired
//private  JavaMailSender mailSender;
//public boolean sendEmail(String to, String subject, String body) {
//	
////	SimpleMessage msg= new SimpleMessage();
////	 msg.setTo(to);
////	msg.setSubject(subject);
////	msg.setText(body);
////	
////	
////	try {
////		MimeMessage MimeMessage= mailSender.createMimeMessage();
////		MimeMessageHelper helper= new MimeMessageHelper(MimeMessage);
////		helper.setTo(to);
////		helper.setSubject(subject);
////		helper.setText(body);
////		
////		mailSender.send(MimeMessage);
////		
////		return true;
////		
////	}catch(Exception e) {
////		e.printStackTrace();
////	}
////  
////	return  false;
////}
//}
