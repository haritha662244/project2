package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Transaction;
import in.ashokit.entity.User;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
   public List<Transaction> findByUser(User user);
}