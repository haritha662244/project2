package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.entity.User;
import in.ashokit.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

	public User saveUser(User user) {
		
		// TODO Auto-generated method stub
		 return userRepository.save(user);
		
	}
}
