package in.ashokit.service;

//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
//import org.springframework.stereotype.Service;
//
//import in.ashokit.entity.User;
//import in.ashokit.repo.UserRepository;
//import jakarta.transaction.Transactional;



import java.util.List;


 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.ashokit.entity.User;
import in.ashokit.repo.UserRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService{
@Autowired
private UserRepository repo;
 
public List<User> listAll() {
    return repo.findAll(Sort.by("email").ascending());
}
}