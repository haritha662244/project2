package in.ashokit.service;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Transaction;

@Service
public class AtmServiceImpl implements AtmService {

    // Mock database for storing user information and transactions
    private Map<String, String> users = new HashMap<>();
    private Map<String, Transaction[]> transactions = new HashMap<>();

    public AtmServiceImpl() {
        // Initialize mock data
        users.put("user1", "1234");
        users.put("user2", "5678");
        transactions.put("user1", new Transaction[10]);
        transactions.put("user2", new Transaction[10]);
    }

    @Override
    public String login(String userId, String pin) {
        if (users.containsKey(userId) && users.get(userId).equals(pin)) {
            return "Login successful!";
        } else {
            return "Invalid user ID or PIN. Please try again.";
        }
    }

    @Override
    public Transaction[] getTransactions(String userId) {
        return transactions.get(userId);
    }

    @Override
    public String withdraw(String userId, double amount) {
        // Implementation logic for withdrawal
        return "Withdrawal successful!";
    }

    @Override
    public String deposit(String userId, double amount) {
        // Implementation logic for deposit
        return "Deposit successful!";
    }

    @Override
    public String transfer(String userId, String recipientId, double amount) {
        // Implementation logic for transfer
        return "Transfer successful!";
    }
}