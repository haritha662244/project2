package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.User;
import in.ashokit.repo.UserRepository;

import java.util.Optional;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public User findByUserId(String userId) {
        return userRepository.findByUserId(userId);
    }

    public boolean isValidUser(String userId, String pin) {
        User user = findByUserId(userId);
        return user != null && user.getPin().equals(pin);
    }
}
