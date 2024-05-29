package in.ashokit.binding;

public class TicketInfo {
	
	private Integer id;
	private String ticketNum;
	private String name;
	private String doj;
	private String from;
	private String to;
	private String trainNum;
	private String status;
	private Integer pid;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTicketNum() {
		return ticketNum;
	}

	public void setTicketNum(String ticketNum) {
		this.ticketNum = ticketNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "TicketInfo [id=" + id + ", ticketNum=" + ticketNum + ", name=" + name + ", doj=" + doj + ", from="
				+ from + ", to=" + to + ", trainNum=" + trainNum + ", status=" + status + ", pid=" + pid + "]";
	}

	

	
}
