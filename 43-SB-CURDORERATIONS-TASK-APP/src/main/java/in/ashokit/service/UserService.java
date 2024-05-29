package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.binding.User;

@Service
public interface UserService {
	
	public String upsert(User user);//insert+update=upsert
	
	public User getById(Integer uid);//give the particular (id)
	
	public List<User> getAllUsers();//get all users
	
	public String deleteById(Integer uid);//based on the given id 

}
