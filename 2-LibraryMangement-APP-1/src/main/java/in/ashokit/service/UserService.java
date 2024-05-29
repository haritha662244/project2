package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService extends UserServiceImpl{
	
	
	
}	

//    @Autowired
//    private UserRepository userRepository;
//
//    public List<User> getAllUsers() {
//        return userRepository.findAll();
//    }
//
//    public User getUserById(Long id) {
//        return userRepository.findById(id)
//                .orElseThrow(() -> new NotFoundException("User not found with id: " + id));
//    }
//
//    public User createUser(User user) {
//        return userRepository.save(user);
//    }
//
//    public User updateUser(Long id, User user) {
//        User existingUser = getUserById(id);
//        existingUser.setUsername(user.getUsername());
//        existingUser.setEmail(user.getEmail());
//        existingUser.setPassword(user.getPassword());
//        // Update other user details as needed
//        return userRepository.save(existingUser);
//    }
//
//    public void deleteUser(Long id) {
//        userRepository.deleteById(id);
//    }
//}
