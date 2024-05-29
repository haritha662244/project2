package in.ashokit.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Passanger;
import in.ashokit.binding.Ticket;
import in.ashokit.repo.TicketRepository;

@Service
public class TicketServiceImpl  implements TicketService{
	
	@Autowired
	private TicketRepository repo;

	@Override
	public Ticket bookTicket(Passanger passanger) {
		Ticket t = new Ticket();
		BeanUtils.copyProperties(passanger, t);
		t.setTicketStatus("CONFIRMED");
		Ticket savedTicket = repo.save(t);
		return savedTicket; 
	}

	@Override
	public Ticket getTicket(Integer ticketId) {
		return repo.findById(ticketId).orElseThrow();
	}

	@Override
	public List<Ticket> getTickets() {
		return  repo.findAll();
	}
	
	

}
