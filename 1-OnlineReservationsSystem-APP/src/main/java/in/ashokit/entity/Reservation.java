package in.ashokit.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId; 
    private String trainNumber;
    private String trainName;
    private String classType;
    private Date dateOfJourney;
    private String fromPlace;
    private String toDestination;
    
    public Reservation() {
    	
    }
  	
	public Reservation(Long id, String userId, String trainNumber, String trainName, String classType,
			Date dateOfJourney, String fromPlace, String toDestination) {
		super();
		this.id = id;
		this.userId = userId;
		this.trainNumber = trainNumber;
		this.trainName = trainName;
		this.classType = classType;
		this.dateOfJourney = dateOfJourney;
		this.fromPlace = fromPlace;
		this.toDestination = toDestination;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getClassType() {
		return classType;
	}
	public void setClassType(String classType) {
		this.classType = classType;
	}
	public Date getDateOfJourney() {
		return dateOfJourney;
	}
	public void setDateOfJourney(Date dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}
	public String getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	public String getToDestination() {
		return toDestination;
	}
	public void setToDestination(String toDestination) {
		this.toDestination = toDestination;
	}

   
}
