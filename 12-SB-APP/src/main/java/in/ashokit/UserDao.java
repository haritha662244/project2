package in.ashokit;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
	public UserDao() {
		System.out.println("UserDao::constructor");
	}

}
