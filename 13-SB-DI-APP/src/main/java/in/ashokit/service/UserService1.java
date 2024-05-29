package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.UserDao;
@Service
public class UserService1 {
	
    @Autowired
	private UserDao userDao;
   
	public UserService1() {
	
	}
	@Autowired
	public UserService1(UserDao userDao) {
		this.userDao=userDao;
	}
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao=userDao;
	}
	
	public void getName(int id) {
		String findName=userDao.findName(id);
		System.out.println("Name::"+findName);
	}

}
