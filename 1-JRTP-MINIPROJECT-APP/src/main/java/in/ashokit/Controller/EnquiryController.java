package in.ashokit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashokit.entity.Enquiry;
import in.ashokit.service.EnquiryService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class EnquiryController {
	@Autowired
	private EnquiryService enqService;
	
	//add enq-page display
	@GetMapping("/enquiry")
	public String addEnquiry(Model model) {//form binding//it is a new enquiry
		model.addAttribute("enq",  new Enquiry());
		return "addEnq";
	}
	
	//save enq
	//this is a post request(or)id is a login page lo session lo implements chesamu.
	@PostMapping("/enquiry")
	public String saveEnquiry(Enquiry enq, HttpServletRequest req,Model model) {
		
		HttpSession session = req.getSession(false);//imp
		Integer counselloreid=(Integer)session.getAttribute("counselloreid");//type casting it to counselore
		
		boolean status = enqService.addEnquiry(enq, counselloreid);
		if(status) {
			model.addAttribute("smsg", "Enquiry Saved");
		}else {
			model.addAttribute("emsg", "Enquiry Not Saved ");
		}

		model.addAttribute("enq",  new Enquiry());
		return "addEnq";
	}
	
	
	//view enqs
	//all the enquiris be logs to login counsellore 
	@GetMapping("/enquiries")
	public String getEnquries(Enquiry enq, HttpServletRequest req,Model model) {
		HttpSession session = req.getSession(false);//imp
		Integer counselloreid=(Integer)session.getAttribute("counselloreid");//not this filter come method
		List<Enquiry> list = enqService.getEnquiries(new Enquiry(), counselloreid);//this is a new id
		model.addAttribute("enqs", list);
		model.addAttribute("enq", new  Enquiry());//empty obje sending this line(or)hyper link is loaded pageis display,  
		return "viewEnquiries";                 //3drop down enquiries , empty obj sending to ui, 
	}                                         //map fiters to the biniding  obj. one binding
	//filter enqs
	@PostMapping("/filter-enqs")
	public String filterEnqs(Enquiry enq, HttpServletRequest req,Model model) {
		HttpSession session = req.getSession(false);//imp(or)filter values come thi method
		Integer counselloreid=(Integer)session.getAttribute("counselloreid");
		List<Enquiry> list=enqService.getEnquiries(enq, counselloreid);//actual id
		model.addAttribute("enqs", list);
		return "viewEnquiries"; 
	}
	
	
	//edit & update enqs
	@GetMapping("/edit")
	public String editEnquiry(@RequestParam ("enqId") Integer enqId,Model model) {//quiry parameter
		Enquiry enquiry =enqService.getEnquiry( enqId);
		model.addAttribute("enq", enquiry);
		return "addEnq";
	}
	
	

}
