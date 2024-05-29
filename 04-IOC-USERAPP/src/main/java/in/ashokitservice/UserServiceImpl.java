package in.ashokitservice;

import in.ashokitDao.IUserDao;

public class UserServiceImpl implements UserService {
	
	private IUserDao userDao;
	
	public UserServiceImpl() {
		System.out.println("UserServiceImpl::0param- constructor");
	}
	
	public UserServiceImpl(in.ashokitDao.IUserDao userDao) {
		System.out.println("UserServiceImpl::param- constructor");
		this.userDao=userDao;
		
	}
	@Override
	public String getName(int id) {
		
      String name=userDao.findName(  id);
	return name;
	}

}
