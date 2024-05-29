package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.dto.Dashboard;
import in.ashokit.entity.Enquiry;

@Service
public interface EnquiryService {
	
	//for dashboard page
	public Dashboard  getDashboardInfo(Integer counselloreId);
	//save enquery
	public boolean addEnquiry(Enquiry enquery, Integer counselloreId);
	
	//view enueries+filter
	public List<Enquiry> getEnquiries(Enquiry enquiry  ,Integer counselloreid);
	
	//edit function.
     public Enquiry getEnquiry(Integer enqId);

     public List<Enquiry> getFilterEnquiries(Enquiry enquiry, Integer counselloreId);
}


