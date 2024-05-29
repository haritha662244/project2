package in.ashokitDao;

public  class UserDaoImpl implements IUserDao {

public UserDaoImpl() {
	System.out.println("UserDaoImpl::constructor");
}


@Override
public  String findName (int id) {
	if(id==100) {
		return "Haritha";
	}else if(id==101) {
			return "Sumalatha";
		}
	
	 return null;	
}
}