package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.entity.UserDtls;
import in.ashokit.repo.UserDtlsRepo;

@Service
public class UserServiceImpl implements UserService{
	
	private UserDtlsRepo userDtlsRepo;
	
	@Override
	public boolean saveUser(UserDtls user) {
		UserDtls savedUser = userDtlsRepo.save(user);
		
		return savedUser !=null;
		
	}
	
	@Override
	public UserDtls getUser(String email) {
		
		return userDtlsRepo.findByEmail(email);
	}
	
	@Override
	public boolean resetpassword(String email, String oldPassword, String newpassword) {
		return false;
	}

}