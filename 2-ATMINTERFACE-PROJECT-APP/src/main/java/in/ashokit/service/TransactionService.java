package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Transaction;
import in.ashokit.entity.User;
import in.ashokit.repo.TransactionRepository;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getTransactionsByUser(User user) {
        return transactionRepository.findByUser(user);
    }

    public void saveTransaction(Transaction transaction) {
        transactionRepository.save(transaction);
    }

    // Additional methods for transaction-related business logic
}
