package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Reservation;
import in.ashokit.service.ReservationService;

@RestController
@RequestMapping("/reservations")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @PostMapping("/create")
    public ResponseEntity<String> createReservation(@RequestBody Reservation reservation) {
       // reservationService.createReservation(reservation);
        return ResponseEntity.ok("Reservation created successfully.");
    }
}
