package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Reservation;
import in.ashokit.repo.ReservationRepository;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    public Reservation getReservationByPnr(String pnr) {
        return reservationRepository.findByPnr(pnr);
}
}