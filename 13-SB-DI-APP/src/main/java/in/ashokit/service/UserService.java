package in.ashokit.service;
////27-2-2024
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao userdao;
	
	public UserService() {
		System.out.println("userservice::default -constructor");
	}
	
	//this is called set constructor level
	@Autowired
	
	public UserService(UserDao userdao) {
		System.out.println("userservice::parm-constructor");
		this.userdao=userdao;
	}
	
//	@Autowired
//	public void setUserdao(UserDao userdao) {
//		System.out.println("setUserDao()-called.....");
//		this.userdao = userdao;
//	}


	public void getName(int id) {
		String findName=userdao.findName(id);
		System.out.println("Name::"+findName);
	}
	
	

}
