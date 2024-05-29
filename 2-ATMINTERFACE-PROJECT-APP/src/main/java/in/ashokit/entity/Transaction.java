package in.ashokit.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double amount;
    private TransactionType type;

    @ManyToOne
    private User user;

   
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public TransactionType getType() {
		return type;
	}

	public void setType(TransactionType type) {
		this.type = type;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public Transaction(Long id, User user, double amount, TransactionType type, LocalDateTime timestamp) {
		super();
		this.id = id;
		this.user = user;
		this.amount = amount;
		this.type = type;
		this.timestamp = timestamp;
	}

	private LocalDateTime timestamp;

  
}

enum TransactionType {
    WITHDRAW,
    DEPOSIT,
    TRANSFER
}