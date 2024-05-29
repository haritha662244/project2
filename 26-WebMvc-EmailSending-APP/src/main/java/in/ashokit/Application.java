package in.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import in.ashokit.service.MailService;
import jakarta.mail.MessagingException;

@SpringBootApplication
public class Application {
@Autowired
private MailService mailService;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {
		mailService.sendMail("gunjiharitha2001@gmail.com","Hello Sir" ," Spring boot Email tutorial");
		mailService.sendMailWithAttachment("gunjiharitha2001@gmail.com","Hello Sir" ," Spring boot Email tutorial","D:\\39-SpringBootNotes\\pdf.text");
	     
	
	}

}
