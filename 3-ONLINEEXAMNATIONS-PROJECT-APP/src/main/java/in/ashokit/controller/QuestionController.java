package in.ashokit.controller;

import java.util.List;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.service.QuestionService;

//QuestionController
@RestController
@RequestMapping("/questions")
public class QuestionController {
 @Autowired
 private QuestionService questionService;
 
 @GetMapping
 public ResponseEntity<List<Question>> getAllQuestions() {
     List<Question> questions = questionService.getAllQuestions();
     return ResponseEntity.ok(questions);
 }
}