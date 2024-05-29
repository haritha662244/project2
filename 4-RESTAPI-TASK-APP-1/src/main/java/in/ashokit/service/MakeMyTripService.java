package in.ashokit.service;


import java.util.List;

import in.ashokit.binding.PassengerInfo;
import in.ashokit.binding.TicketInfo;

public interface MakeMyTripService {
public TicketInfo bookTickets(PassengerInfo p);
List<TicketInfo>getAllTickets();
}
