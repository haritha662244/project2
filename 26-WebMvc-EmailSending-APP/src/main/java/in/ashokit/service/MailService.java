package in.ashokit.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
@Service
public class MailService {
	@Autowired
	private JavaMailSender mailSender;
	
	
	public void sendMail(String to,String  subject ,String body) {
		SimpleMailMessage msg= new SimpleMailMessage();
		msg.setTo(to);
		msg.setSubject(subject);
		msg.setText(body);
		mailSender.send(msg);
		//this line is attachment files 
		System.out.println("Mail Sent");
	}
	
	public void sendMailWithAttachment(String to,String  subject ,String body, String Attchment) throws MessagingException  {
		MimeMessage msg = mailSender.createMimeMessage();
		MimeMessageHelper helper= new MimeMessageHelper(msg,true);
		helper.setTo(to);
		helper.setSubject(subject);
		helper.setText(body);
		//Attachment files ne  oka class undhi system numchi file read cheyadaniki 
		FileSystemResource resource= new FileSystemResource (new File(Attchment));
		helper.addAttachment(resource.getFilename(),resource);
		mailSender.send(msg);
		//this line is attachment files kosam
		System.out.println("Mail Sent with Attchement");
	}

}
