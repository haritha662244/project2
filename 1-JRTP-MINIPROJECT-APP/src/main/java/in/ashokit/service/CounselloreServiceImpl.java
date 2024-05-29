package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Counsellore;
import in.ashokit.repo.CounselloreRepository;
@Service
public class CounselloreServiceImpl  implements CounselloreService{
	
	@Autowired
	private CounselloreRepository counselloreRepo;

	//this method is used to saved counselloredata storing database
	
	//counsellore saved method is available
	//counsellorerepo is will be generated  if id is generated that means record is inserted
	//otherwise not inserted table
	
	//this method but their  is probleam duplicates counsellore registration will happen
	//how i need to  stop that duplicates couserrlerregistration.how will it stopetby retriving email id. 

	//i will retrive  the user record based on the email id
	
	@Override
	public boolean saveCounsellore(Counsellore counsellore) {
		
		Counsellore findByEmail = counselloreRepo.findByEmail(counsellore.getEmail());
	//find by email is used to already  the given email id registration already completed
	//if this given email id  if record is already is available. i don't wont to the    inserted record.
	//if the given email id if record is not available then only  i want to save the record.
    //i don't want to mutiple registration  the same email id.email id should be unique value int system		
    //(saveCounsellore) method is available I'm getting the  (Counselor counselor) counselor obj the getting the object,
		
	// getting the email id(getEmail()) if the email is checking the in the email in the table.
	//email is same value ity return false.return not available then only(Counselor savedCounsellore = counselloreRepo.save(counsellore)
  
		if(findByEmail != null) {
			return false;
		}else {
			Counsellore savedCounsellore = counselloreRepo.save(counsellore);
			return savedCounsellore.getcounselloreId() != null ;
		}
	}
	//( getCounsellore) method is avalable it will take emailid and pwd.
	//when the counsellore id we will get the  emailid and pwds based on that emailid and pwds
    // we will retrive the (counsellore) record.
	//return object entity obj  iam returnining the save entity object
	//if the given email id,pwd is current it return true value if the given mailid,pwds is,
	//is record is availble then it will return  false value.
	
	@Override
	public Counsellore getCounsellore(String email, String pwd) {
		return counselloreRepo.findByEmailAndPwd(email, pwd);
		
	}

}
 