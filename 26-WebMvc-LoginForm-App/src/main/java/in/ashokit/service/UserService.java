package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.entity.User;

@Service
public interface UserService {
	//this method is register method,user data will come obj ,if the record is insert
	//true other wise false value
	//after insertion send to the user

	public boolean saveUser(User user);
	
	//this method is login method,loginto email,pwd inthe present intha record is DBASE 
	//valued  credintial other wise invalued credantils.
	public User getUser(String email,String pwd);
	
   
}
