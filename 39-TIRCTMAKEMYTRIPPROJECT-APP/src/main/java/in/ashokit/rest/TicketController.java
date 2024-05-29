package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.Passenger;
import in.ashokit.binding.Ticket;
import in.ashokit.service.TicketService;
import reactor.core.publisher.Mono;

@Controller
public class TicketController {
	@Autowired
	private TicketService ticketService;
	
	@GetMapping("/")
	public String loadPage(Model model) {
		model.addAttribute("passenger", new Passenger());
		return "index";	
	}
	@PostMapping("/bookTicket")
	public String bookTicket(Passenger p , Model model) {
		Mono<Ticket> bookTicket = ticketService.bookTicket(p);
		Ticket ticket = bookTicket.block();
		model.addAttribute("ticket", ticket);
		return "index";
	}
	@GetMapping("/getTickets")
	public String getTickets(Model model) {
		Mono<Ticket[]> tickets = ticketService.getTickets();
		Ticket[] getTickets = tickets.block();
		model.addAttribute("tickets", getTickets);
		
		return "viewAllTickets";
	}
	

	

}