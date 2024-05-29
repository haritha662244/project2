package in.ashokit.service;

import in.ashokit.entity.UserDtls;

public interface UserService {
	
	public boolean saveUser(UserDtls user);
	
	public UserDtls getUser(String email);
	
	public boolean resetpassword(String email,String oldpassword, String newPassword);

}