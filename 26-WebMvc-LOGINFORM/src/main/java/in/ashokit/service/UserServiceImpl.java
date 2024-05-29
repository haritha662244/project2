package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.UserDetails;
import in.ashokit.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo userRepo;

	@Override
	public boolean saveUser(UserDetails user) {
		UserDetails savedUser = userRepo.save(user);
		if (savedUser.getId() != null) {
			String subject = "Your Account Creatd -Ashok IT";
			String body = "Congratulations ,Welcome to board...";
			// emailUtils.sendEmail(user.getEmail(),subject,body);
		}
		return true;

	}

	@Override
	public UserDetails getUser(String email, String pwd) {
		return userRepo.findByMailAndPwd(email, pwd);

	}
}
