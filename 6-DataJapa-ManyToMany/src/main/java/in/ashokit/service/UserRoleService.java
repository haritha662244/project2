package in.ashokit.service;

import java.time.LocalDate;
import java.util.Arrays;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Role;
import in.ashokit.entity.User;
import in.ashokit.repo.RoleRepo;
import in.ashokit.repo.UserRepo;

@Service
public class UserRoleService {
	
	@Autowired
	private UserRepo userRepo;

	@Autowired
	private RoleRepo roleRepo;

	public void saveUserWithRoles() {

		Role r1 = new Role();
		r1.setRoleName("Manager");

		Role r2 = new Role();
		r2.setRoleName("Admin");

		User user = new User();
		user.setUserName("Ashok");
		user.setGender("Male");
		user.setUserDob(LocalDate.now().minusYears(20));

		user.setRoles(Arrays.asList(r1, r2));

		userRepo.save(user);

	}

	public void getUser(integer id) {
		Optional<User> findById = userRepo.findById(id);

	}

	public void getRole(integer id) {
		Optional<Role> findById = roleRepo.findById(id);


	}
}


