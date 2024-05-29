package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.User;
import in.ashokit.repo.UserRepository;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository  userRepository;
	
	@Override
	public String upsert(User user) {
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getById(Integer uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteById(Integer uid) {
		// TODO Auto-generated method stub
		return null;
	}

}
