
	package in.ashokit.service;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.security.crypto.password.PasswordEncoder;
	import org.springframework.stereotype.Service;

	import in.ashokit.entity.User;
	import in.ashokit.repo.UserRepository;

	@Service
	public class UserDetailService {

	    @Autowired
	    private UserRepository userRepository;

	    @Autowired
	    private PasswordEncoder passwordEncoder;

	    public User findByUsername(String username) {
	        return userRepository.findByUsername(username);
	    }

	    public void save(User user) {
	        user.setPassword(passwordEncoder.encode(user.getPassword()));
	        userRepository.save(user);
	    }
	}


