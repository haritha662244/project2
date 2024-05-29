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
	@Override
	public boolean addEnquiry(Enquiry enquiry, Integer counselloreId) {
		Counsellore counsellore=counselloreRepo.findById(counselloreId).orElseThrow();
		//this line is used to  filter also 
		enquiry.setCounsellore(counsellore);// association for fk key
		Enquiry savedEnq = enqRepo.save(enquiry);	
		return savedEnq.getEnqId()!=null;

	}
	@Override
	public List<Enquiry> getEnquiries(Enquiry enquiry, Integer counselloreId) {
		Counsellore counsellor = counselloreRepo.findById(counselloreId).orElseThrow();
		  enquiry.setCounsellore(counsellor);
		//dynamic query creation
		Example<Enquiry> of = Example.of(enquiry);
		System.out.println(enqRepo.findAll(of));
		return enqRepo.findAll(of);
	}
	@Override
	public List<Enquiry> getFilterEnquiries(Enquiry enquiry, Integer counselloreId) {
		//Counsellore counsellor = counselloreRepo.findById(counselloreId).orElseThrow();
		 // enquiry.setCounsellore(counsellor);
		//dynamic query creation
		//Example<Enquiry> of = Example.of(enquiry);
		//System.out.println(enqRepo.findAll(of));
		return enqRepo.getFilterEnquiries(counselloreId,enquiry.getCourses(),enquiry.getMode(),enquiry.getStatus());
	}

	@Override
	public Enquiry getEnquiry(Integer enqId) {
		return enqRepo.findById(enqId).orElseThrow();

	}

}


