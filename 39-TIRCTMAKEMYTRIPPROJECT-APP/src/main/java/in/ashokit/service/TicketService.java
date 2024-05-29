package in.ashokit.service;



import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.binding.Passenger;
import in.ashokit.binding.Ticket;
import reactor.core.publisher.Mono;
@Service
public class TicketService {
	
	private final String SAVE_TICKET_URL = "http://localhost:8081/bookTicket";
	private final String GET_TICKET_URL = "http://localhost:8081/getAllTickets";
	
	public Mono<Ticket> bookTicket(Passenger p){
		
		WebClient webClient = WebClient.create();
		   
		Mono<Ticket> bodyToMono = webClient.post()
		                                   .uri(SAVE_TICKET_URL)
		                                   .body(BodyInserters.fromValue(p))
		                                   .retrieve()
		                                   .bodyToMono(Ticket.class);
		
		return bodyToMono;	
	}
	public Mono<Ticket[]> getTickets(){
		WebClient webClient = WebClient.create();
		Mono<Ticket[]> bodyToMono = webClient.get()
		                                     .uri(GET_TICKET_URL)
		                                     .retrieve()
		                                     .bodyToMono(Ticket[].class);
		return bodyToMono;
	}

}
