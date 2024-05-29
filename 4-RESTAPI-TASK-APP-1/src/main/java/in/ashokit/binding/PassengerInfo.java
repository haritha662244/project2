package in.ashokit.binding;

public class PassengerInfo {

	private Integer pid;
	private String name;
	private String email;
	private String doj;
	private String from;
	private String to;
	private String trainNum;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

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

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTrainNum() {
		return trainNum;
	}

	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}

	@Override
	public String toString() {
		return "PassengerInfo [pid=" + pid + ", name=" + name + ", email=" + email + ", doj=" + doj + ", from=" + from
				+ ", to=" + to + ", trainNum=" + trainNum + "]";
	}

}