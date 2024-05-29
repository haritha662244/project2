package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Reservation;
import in.ashokit.repository.ReservationRepository;
import jakarta.transaction.Transactional;

@Service
public class ReservationService {
	public ReservationService() {
		
	}
	@Autowired
    private  ReservationRepository reservationRepository;

   

    public Reservation saveReservation(Reservation reservation) {
       return reservationRepository.save(reservation);
    }
    public Reservation findByPnrNumber(String pnrNumber) {
        return reservationRepository.findByPnrNumber(pnrNumber);
    }

    @Transactional
    public void cancelReservationByPnrNumber(String pnrNumber) {
        reservationRepository.deleteByPnrNumber(pnrNumber);
    }

	
}