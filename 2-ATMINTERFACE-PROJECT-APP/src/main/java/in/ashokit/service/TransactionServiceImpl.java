package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Transaction;

import in.ashokit.repo.TransactionRepository;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public List<Transaction> getTransactionsByUser(User user) {
        return transactionRepository.findByUser(user);
    }

    @Override
    public void saveTransaction(Transaction transaction) {
        transactionRepository.save(transaction);
    }
}
