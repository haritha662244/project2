package in.ashokit.service;


import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.binding.PassengerInfo;
import in.ashokit.binding.TicketInfo;
@Service
public class MakeMyTripImpl implements MakeMyTripService {

	@Override
	public TicketInfo bookTickets(PassengerInfo p) {
		String apiURL= "localhost:1111/ticket";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<TicketInfo> forEntity = rt.postForEntity(apiURL, p, TicketInfo.class);
		TicketInfo body = forEntity.getBody();
		return body;
	}

	@Override
	public List<TicketInfo> getAllTickets() {
		String apiURL ="localhost:1111/tickets";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<TicketInfo[]> forEntity = rt.getForEntity(apiURL, TicketInfo[].class);
		TicketInfo[] body = forEntity.getBody();
		List<TicketInfo> ticketInfos = Arrays.asList(body);
		return ticketInfos;
	}

}
