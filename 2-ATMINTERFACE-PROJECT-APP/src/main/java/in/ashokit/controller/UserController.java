package in.ashokit.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/atm")
public class UserController {

    private String userId = "user123";
    private String pin = "1234";

    @PostMapping("/login")
    public String login(@RequestParam String userId, @RequestParam String pin) {
        if (userId.equals(this.userId) && pin.equals(this.pin)) {
            return "Login successful. Welcome, " + userId + "!";
        } else {
            return "Invalid credentials. Please try again.";
        }
    }

    @GetMapping("/transactions")
    public String getTransactions() {
        // Implement logic to fetch transaction history
        return "Transaction history...";
    }

    @PostMapping("/withdraw")
    public String withdraw(@RequestParam double amount) {
        // Implement logic for withdrawal
        return "Withdrawal of $" + amount + " successful.";
    }

    @PostMapping("/deposit")
    public String deposit(@RequestParam double amount) {
        // Implement logic for deposit
        return "Deposit of $" + amount + " successful.";
    }

    @PostMapping("/transfer")
    public String transfer(@RequestParam String recipient, @RequestParam double amount) {
        // Implement logic for transfer
        return "Transfer of $" + amount + " to " + recipient + " successful.";
    }
}
