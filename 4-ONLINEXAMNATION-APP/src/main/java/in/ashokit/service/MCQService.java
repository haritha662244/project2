package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Answer;
import in.ashokit.entity.MCQ;
import in.ashokit.repo.MCQRepository;

@Service
public class MCQService {

    @Autowired
    private MCQRepository mcqRepository;

    public List<MCQ> getAllMCQs() {
        return mcqRepository.findAll();
    }

    public boolean gradeAnswers(List<Answer> answers) {
        // Logic to grade answers
        return true; // or false based on success or failure
    }
}
