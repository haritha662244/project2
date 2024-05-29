package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.User;
import in.ashokit.repo.UserRepository;

//UserController
@RestController
@RequestMapping("/user")
public class UserController {
 @Autowired
 private UserRepository userRepository;

 @PutMapping("/{id}")
 public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
     User user = userRepository.findById(id)
         .orElseThrow( new ResourceNotFoundException("User not found with id " + id));
     
     user.setUsername(updatedUser.getUsername());
     user.setPassword(updatedUser.getPassword());
     
     User savedUser = userRepository.save(user);
     return ResponseEntity.ok(savedUser);
 }
}
