package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Answer;
import in.ashokit.entity.MCQ;
import in.ashokit.service.MCQService;

@Controller
@RequestMapping("/api")
public class MCQController {

    @Autowired
    private MCQService mcqService;

    @GetMapping("/mcqs")
    public ResponseEntity<List<MCQ>> getMCQs() {
        List<MCQ> mcqs = mcqService.getAllMCQs();
        return ResponseEntity.ok(mcqs);
    }

    @PostMapping("/submitAnswers")
    public ResponseEntity<String> submitAnswers(@RequestBody List<Answer> answers) {
        boolean result = mcqService.gradeAnswers(answers);
        if (result) {
            return ResponseEntity.ok("Answers submitted successfully");
        } else {
            return ResponseEntity.badRequest().body("Error submitting answers");
        }
    }
}
