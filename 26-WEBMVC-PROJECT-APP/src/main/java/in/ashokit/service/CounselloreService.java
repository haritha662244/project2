package in.ashokit.service;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Counsellore;
@Service
public interface CounselloreService {
	//this line is counselor registration method 
	public boolean saveCounsellore(Counsellore counsellore);
	
	public Counsellore getCounsellore(String email,String pwd);

}


