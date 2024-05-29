package in.ashokit.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MCQ {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String question;
    private List<String> options;
    private String correctAnswer;
	public MCQ(Long id, String question, List<String> options, String correctAnswer) {
		super();
		this.id = id;
		this.question = question;
		this.options = options;
		this.correctAnswer = correctAnswer;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
}
