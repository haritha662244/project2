package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private Long mcqId;
    private String selectedOption;
	public Answer(Long userId, Long mcqId, String selectedOption) {
		super();
		this.userId = userId;
		this.mcqId = mcqId;
		this.selectedOption = selectedOption;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getMcqId() {
		return mcqId;
	}
	public void setMcqId(Long mcqId) {
		this.mcqId = mcqId;
	}
	public String getSelectedOption() {
		return selectedOption;
	}
	public void setSelectedOption(String selectedOption) {
		this.selectedOption = selectedOption;
	}
}

