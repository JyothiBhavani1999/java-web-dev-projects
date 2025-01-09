package org.launchcode;

import java.util.Arrays;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        quiz.addQuestion(new multipleChoice("Who is the president of America?",
                Arrays.asList("kamala harris","trump","biden"),"trump"));
        quiz.addQuestion(new checkbox("select the progamming languages:",Arrays.asList("java","HTML","python","CSS"),Arrays.asList(0,2)));
        quiz.addQuestion(new TrueOrFalse("Sun rises in the east", "false"));

        quiz.run();
    }
}
