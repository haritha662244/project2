package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.dto.UserDTO;
import in.ashokit.entity.User;
import in.ashokit.repo.UserRepo;
@Service
public class UserServiceImpl implements UserService {

	@Override
	public boolean saveUser(User user) {
		return false;
	}

	@Override
	public User getUser(String email, String pwd) {
		return null;
	}
	
	
	

}
