package in.ashokit;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdService {
	public PwdService() {
		System.out.println("PwdService::constructor");
	}
	public String encodePwd (String Pwd) {
		Encoder  encoder=Base64.getEncoder();
		byte[] encodePwd=encoder.encode(Pwd.getBytes());
		return new String(encodePwd);
		
		
	}
	

}
