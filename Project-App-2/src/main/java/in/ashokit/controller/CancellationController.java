package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashokit.entity.Cancellation;
import in.ashokit.entity.Reservation;
import in.ashokit.service.CancellationService;
import in.ashokit.service.ReservationService;

@Controller
public class CancellationController {
	@SuppressWarnings("unused")
	@Autowired
    private  CancellationService cancellationService;
	
	@Autowired
	private ReservationService reservationService;

   

    @GetMapping("/cancellation")
    public String cancellationForm(Model model) {
//        model.addAttribute("cancellation", new Cancellation());
        return "cancellation";
    }
    @PostMapping("/cancel")
    public String cancelReservation(@RequestParam("pnrNumber") String pnrNumber, Model model) {
        Reservation reservation = reservationService.findByPnrNumber(pnrNumber);
        if (reservation != null) {
            model.addAttribute("reservation", reservation);
            return "cancellationConfirmation";
        } else {
            model.addAttribute("msg", "No reservation found with PNR number: " + pnrNumber);
            return "cancellation";
        }
    }

    @PostMapping("/confirmCancellation")
    public String confirmCancellation(@RequestParam("pnrNumber") String pnrNumber,Model model) {
        reservationService.cancelReservationByPnrNumber(pnrNumber);
        model.addAttribute("reservation", new Reservation());
        model.addAttribute("msg"," Your Reservation Was Cancelled");
        return "reservation";
       
    }
//    @PostMapping("/cancellation")
//    public String cancelReservation(@ModelAttribute("cancellation") Cancellation cancellation) {
//        // Logic to cancel reservation
//        return "redirect:/";
//    }
}
