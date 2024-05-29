package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.service.CancellationService;

@RestController
@RequestMapping("/api")
public class CancellationController {

    @Autowired
    private CancellationService cancellationService;

    @PostMapping("/cancel")
    public ResponseEntity<String> cancelReservation(@RequestParam String pnrNumber) {
        if (cancellationService.cancelReservation(pnrNumber)) {
            return ResponseEntity.ok("Reservation canceled successfully.");
        } else {
            return ResponseEntity.badRequest().body("Failed to cancel reservation.");
        }
    }
}
