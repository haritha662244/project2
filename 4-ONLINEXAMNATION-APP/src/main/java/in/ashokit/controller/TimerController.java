package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.service.TimerService;

@Controller
@RequestMapping("/api")
public class TimerController {

    @Autowired
    private TimerService timerService;

    @PostMapping("/startTimer")
    public ResponseEntity<String> startTimer() {
        timerService.startTimer();
        return ResponseEntity.ok("Timer started");
    }

    @PostMapping("/autoSubmit")
    public ResponseEntity<String> autoSubmit() {
        timerService.autoSubmit();
        return ResponseEntity.ok("Answers auto-submitted");
    }
}
