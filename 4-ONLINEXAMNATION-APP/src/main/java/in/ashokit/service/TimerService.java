package in.ashokit.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Answer;

@Service
public class TimerService {
	 @Autowired
     private MCQService mcqService;

//    public void startTimer() {
//        // Logic to start timer
//    }
//
//    public void autoSubmit() {
//        // Logic to auto-submit answers
//    }
//    
   

        private static final int TIME_LIMIT_SECONDS = 300; // 5 minutes in seconds
        private static final int AUTO_SUBMIT_DELAY_SECONDS = 10; // Auto-submit delay in seconds

        private Timer timer;
        private boolean timerStarted;
        private boolean autoSubmitTriggered;

//        @Autowired
//        private MCQService mcqService;

        public void startTimer() {
            if (!timerStarted) {
                timerStarted = true;
                timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        autoSubmit();
                    }
                }, TIME_LIMIT_SECONDS * 1000); // Convert seconds to milliseconds
            }
        }

        public void autoSubmit() {
            if (!autoSubmitTriggered) {
                autoSubmitTriggered = true;
                timer.cancel(); // Cancel timer
                // Logic to auto-submit MCQ answers
                List<Answer> answers = fetchAnswers(); // Fetch answers from frontend or database
                boolean result = mcqService.gradeAnswers(answers);
                if (result) {
                    System.out.println("Answers auto-submitted successfully");
                } else {
                    System.out.println("Error submitting answers");
                }
            }
        }

        private List<Answer> fetchAnswers() {
            // Mock implementation to fetch answers from frontend or database
            List<Answer> answers = new ArrayList<>();
            answers.add(new Answer(1L, 1L, "option1"));
            answers.add(new Answer(1L, 2L, "option2"));
            // Add more answers as needed
            return answers;
        }

		public boolean authenticate(String username, String password) {
			// TODO Auto-generated method stub
			return false;
		}
    }


