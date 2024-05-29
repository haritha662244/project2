package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.dto.Dashboard;
import in.ashokit.entity.Enquiry;

@Service
public interface EnquiryService {
	
	//this is method is dashbord person to person same dateof brith kadu kada so diffrent kada 
	//so parameters passing  counsellor id .
	//total enquiries totalenqs,openenqs,enrolledenqs,lostenqs willdisplayis method purpos
	
	//for dashboard page
	public Dashboard  getDashboardInfo(Integer counselloreId);
	
	//add enquery method alrady to the enquery class is available in form binding
	//add method is councellerlogin add enq is avaliable
	
	//save enquery
	public boolean addEnquiry(Enquiry enquery, Integer counselloreId);
	
	//it is used to retrive  all the enquries  is avaliable in the table
	//it is usetd to quirybyexample used to datajpa dynamic filter.
	//this is purpos of code parameter passing
	//form the enqry is  form iam taking the data it willbe record is inserted it will return 
	//true or false
	
	//view enueries+filter
	public List<Enquiry> getEnquiries(Enquiry enquiry  ,Integer counselloreid);
	
	
   //it is going to all the enquery is avaliable based on the counsellor id
	//edit function.
     public Enquiry getEnquiry(Integer enqId);


}
