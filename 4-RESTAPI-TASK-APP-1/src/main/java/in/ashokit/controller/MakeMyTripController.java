package in.ashokit.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.PassengerInfo;
import in.ashokit.binding.TicketInfo;
import in.ashokit.service.MakeMyTripService;


@Controller
public class MakeMyTripController {
	private MakeMyTripService mService;

	@PostMapping("/ticket")
	public String bookBickets(@ModelAttribute("p") PassengerInfo p, Model model) {
		TicketInfo bookTicket = mService.bookTickets(p);
		model.addAttribute("mag", "Your Ticket Booked" + bookTicket.getTicketNum());
		return "bookTicket";
	}
@GetMapping("/book-Ticket")
	public String bookTicket(Model model) {
	model.addAttribute("p", new PassengerInfo());
		return "bookTicket";
	}
@GetMapping("/")
public String index(Model model) {
	List<TicketInfo> allTickets = mService.getAllTickets();
	model.addAttribute("tickets", allTickets);
	return "index";
}
}
