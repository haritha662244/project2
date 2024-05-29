package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Counsellore;
@Service
public interface CounselloreService {
	//this line is counselor registration method 
	public boolean saveCounsellore(Counsellore counsellore);
	
	//this line is login page will be email&pwd is curent it display counsellor (or) email&pwd is not current
	//it will return null values
	public Counsellore getCounsellore(String email,String pwd);// this is a login implentation class

}
