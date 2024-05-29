package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;
    
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }
}