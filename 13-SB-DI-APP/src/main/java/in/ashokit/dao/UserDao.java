package in.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository
//repository is know as  it is component family it use service and you can repository.
//this is spring bean class.
//ioc  will created identify object class is spring bean.
//this is called repository annotations
public class UserDao {
	public UserDao() {
		//to tell from IOC container null point exception.
		System.out.println("UserDao::constructor");
	}
	public  String findName(int id) {
		if(id==100) {
			return "hari";
			
		}else {
			return "suma";
		}
	}

}
