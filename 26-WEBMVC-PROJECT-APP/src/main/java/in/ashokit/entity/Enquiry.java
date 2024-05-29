package in.ashokit.entity;
import java.time.LocalDate;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Enquiry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer enqId;
	private String  stuName;
	@Override
	public String toString() {
		return "Enquiry [enqId=" + enqId + ", stuName=" + stuName + ", stuPhno=" + stuPhno + ", mode=" + mode
				+ ", courses=" + courses + ", status=" + status + ", createDate=" + createDate + ", updateDate="
				+ updateDate +  "]";
	}


	private Long stuPhno;
	private String mode;
	private String courses;
	private String status;
	
	@CreationTimestamp
	private LocalDate createDate;
	@UpdateTimestamp
	private LocalDate updateDate;
	
	public Integer getEnqId() {
		return enqId;
	}
	public void setEnqId(Integer enqId) {
		this.enqId = enqId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Long getStuPhno() {
		return stuPhno;
	}
	public void setStuPhno(Long stuPhno) {
		this.stuPhno = stuPhno;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public LocalDate getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}
	

//Associated mapping or which type of relationship and this is  a 1 class is available 
	@ManyToOne
    @JoinColumn(name="counsellor_id") 
	private Counsellore counsellore;
	public void setCounsellore(Counsellore counsellor2) {
	 this.counsellore = counsellor2;
		
	}
	
	
	}
	



