package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ashokit.entity.MCQ;

import java.util.ArrayList;
import java.util.List;

@Controller
public class QuizController {

    @GetMapping("/quiz")
    public String showQuiz(Model model) {
        List<MCQ> mcqs = generateMCQs(); // Generate some sample MCQs
        model.addAttribute("mcqs", mcqs);
        return "quiz";
    }

    private List<MCQ> generateMCQs() {
        // Generate and return a list of MCQs (Multiple Choice Questions)
        List<MCQ> mcqs = new ArrayList<>();
        // Add sample MCQs here
        return mcqs;
    }
}
