package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import in.ashokit.dto.Dashboard;
import in.ashokit.entity.Counsellore;
import in.ashokit.entity.Enquiry;
import in.ashokit.repo.CounselloreRepository;
import in.ashokit.repo.EnquiryRepository;
@Service
public class EnquiryServiceImpl implements EnquiryService {
	@Autowired
	private EnquiryRepository enqRepo;
	@Autowired
	private CounselloreRepository counselloreRepo;
//this purpos of method it is going to retrive the data from the enquire,
	//table based on the counsellore id,enquiry status
	@Override
	public Dashboard getDashboardInfo(Integer counselloreId) {
		Long totalEnq= enqRepo.getEnquries(counselloreId);
		Long openCount = enqRepo.getEnquries(counselloreId, "new");
		Long lostCount = enqRepo.getEnquries(counselloreId, "lost");
		Long enrolledCount=enqRepo.getEnquries(counselloreId, "enrolled");
		
		Dashboard d= new Dashboard();
		d.setTotalEnqs(totalEnq);
		d.setEnrolledEnqs(enrolledCount);
		d.setLostEnqs(lostCount);
		d.setOpenEnqs(openCount);
		return d;
	}
   //this method is use to addenquriy method means save the enquire data,
	//counseller wiil login  into the applcation  they will the save enquiry data here
	@Override
	public boolean addEnquiry(Enquiry enquiry, Integer counselloreId) {
		Counsellore counsellore=counselloreRepo.findById(counselloreId).orElseThrow();
		//this line is used to  filter also 
		enquiry.setCounsellore(counsellore);// association for fk key
		Enquiry savedEnq = enqRepo.save(enquiry);	
		return savedEnq.getEnqId()!=null;

	}
   // this is used  to retrive tha data for the table,when you click on view enqueris all the exiting the 
	//records come here  iam saving to  display here.
	//login ity evari dat valaki display avutundhi not the all the information.
	// select * from the based on the counselloreid
	@Override
	public List<Enquiry> getEnquiries(Enquiry enquiry, Integer counselloreId) {
		Counsellore counsellor = counselloreRepo.findById(counselloreId).orElseThrow();
		  enquiry.setCounsellore(counsellor);
		//dynamic query creation
		Example<Enquiry> of = Example.of(enquiry);
		return enqRepo.findAll(of);
	}

	@Override
	public Enquiry getEnquiry(Integer enqId) {
		return enqRepo.findById(enqId).orElseThrow();

	}

}
