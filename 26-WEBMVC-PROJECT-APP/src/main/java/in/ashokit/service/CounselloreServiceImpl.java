package in.ashokit.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.ashokit.entity.Counsellore;
import in.ashokit.repo.CounselloreRepository;
@Service
public class CounselloreServiceImpl  implements CounselloreService{
	
	@Autowired
	private CounselloreRepository counselloreRepo;
	
	@Override
	public boolean saveCounsellore(Counsellore counsellore) {
		
		Counsellore findByEmail = counselloreRepo.findByEmail(counsellore.getEmail());
  
		if(findByEmail != null) {
			return false;
		}else {
			Counsellore savedCounsellore = counselloreRepo.save(counsellore);
			return savedCounsellore.getcounselloreId() != null ;
		}
	}
	
	@Override
	public Counsellore getCounsellore(String email, String pwd) {
		return counselloreRepo.findByEmailAndPwd(email, pwd);
		
	}

}
 


