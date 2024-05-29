package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.entity.Question;
import in.ashokit.service.QuestionService;
import jakarta.servlet.http.HttpSession;

@Controller
public class AdminController {
	
	@Autowired  UserService uservice;
	
	@Autowired QuestionService qservice;
	
	@Autowired HttpSession session;
	
	@Autowired ExamService eservice;
	
@GetMapping("/dashboard")
public String home( Model model) {
	model.addAttribute("totalQues",qservice.AllQuestions().size());
	model.addAttribute("totalusers",uservice.AllUsers().size());
	model.addAttribute("totalcler",uservice.clearCount());
	model.addAttribute("totalfail",uservice.failureCount());
	return "dashboard";
}
@GetMapping("/addques")
public String addQuestions() {
	return "addquestions";
}
@GetMapping("/questions")
public String Allquestions(Model model) {
	model.addAttribute("list", qservice.allQuestions());
	return "questions";
}

@PostMapping("/addques")
public String saveQuestion(Question q,multipartFile qphoto,RedirectAttributed ra) {
	qservice.saveQuestion(qphoto,q);
	ra.addFlasAttributed("msg", "Question added sucessfully...!!");
	return "redirect:/questions";
}

@GetMapping("/users")
public String allusers(Model model) {
	model.addAttribute("list", uservice.allUsers());
	return "users";
}

@GetMapping("/report")
public String examreport(Model model,String userid) {
	model.addAttribute("user", uservice.findByUserid(userid));
	model.addAttribute("correct", eservice.correctCount(userid));
	model.addAttribute("incorrect", eservice.incorrectCount(userid));
	model.addAttribute("list", eservice.getQuestions(userid));
	
	return "examreport";
	
	
}

}
