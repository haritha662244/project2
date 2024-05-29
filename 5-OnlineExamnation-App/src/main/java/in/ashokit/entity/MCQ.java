package in.ashokit.entity;

import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class MCQ {
    private String question;
    private List<String> options;
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getOptions() {
		return options;
	}
	public void setOptions(List<String> options) {
		this.options = options;
	}

}
