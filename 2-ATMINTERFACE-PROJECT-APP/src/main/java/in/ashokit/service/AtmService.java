package in.ashokit.service;

import in.ashokit.entity.Transaction;

public interface AtmService {
    String login(String userId, String pin);
    Transaction[] getTransactions(String userId);
    String withdraw(String userId, double amount);
    String deposit(String userId, double amount);
    String transfer(String userId, String recipientId, double amount);
}
