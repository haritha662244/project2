//package in.ashokit.service;
//
//import org.springframework.stereotype.Service;
//import org.springframework.web.reactive.function.BodyInserters;
//import org.springframework.web.reactive.function.client.WebClient;
//
//import in.ashokit.binding.Passenger;
//import in.ashokit.binding.Ticket;
//import reactor.core.publisher.Mono;
//
//@Service
//public class MakeMyTripService {
//	
//	 private final String BOOK_TICKET_URL="http://localhost:8081/ticket";
//	 private final String GET_TICKET_URL="http://localhost:8081/tickets";
//	 
//	 public Mono<Ticket> bookTicket(Passenger p){
//		 //logic to send post request
//
//		 WebClient webclient = WebClient.create();
//		 return webclient.post()
//				         .uri(BOOK_TICKET_URL)
//				         .body(BodyInserters.fromValue(p))
//				         .retrieve()
//				         .bodyToMono(Ticket.class);
//	 }
//	 public Mono<Ticket[]> getAllTickets(){
//		 //logic tosend get request
//		 
//		 WebClient webclient = WebClient.create();
//		 return webclient.get()
//				         .uri( GET_TICKET_URL)
//				         .retrieve()
//				         .bodyToMono(Ticket[].class);
//		 
//		 
//	 }
//
//}
