package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.User;
import in.ashokit.repo.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
        
        
    }
//    public User getUserByUserpassword(String password) {
//    	return userRepository.findByUserpassword(password);
//    
//}
}