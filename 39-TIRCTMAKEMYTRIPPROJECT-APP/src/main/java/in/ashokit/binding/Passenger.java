package in.ashokit.binding;

public class Passenger {

	private String name;
	private String email;
	private String gender;
	private String source;
	private String destination;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	private String trainNumber;
}
