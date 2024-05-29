package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.binding.Passanger;
import in.ashokit.binding.Ticket;
@Service
public interface TicketService {
	public Ticket bookTicket(Passanger passanger);
	
	public Ticket  getTicket(Integer ticketId);
	
	public List<Ticket> getTickets(); 

}
