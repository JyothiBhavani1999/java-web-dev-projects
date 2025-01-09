package org.launchcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<questions> questions;

    public Quiz() {
        this.questions = new ArrayList<>();
    }

    public void addQuestion(questions question) {
        questions.add(question);
    }

    public void run() {
        int score = 0;
        Scanner sc = new Scanner(System.in);
        for (questions question : questions) {
            question.display();
            System.out.println("Enter your answer:");
            String userAnswer = sc.nextLine();
            if (question.checkAnswer(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect.");
            }
        }
        System.out.println("Your final score is: " + score + "/" + questions.size());
    }
}

