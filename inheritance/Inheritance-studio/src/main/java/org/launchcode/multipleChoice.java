package org.launchcode;

import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class multipleChoice extends questions{
    private final List<String> options;
    private final String correctAnswer;

    public multipleChoice(String questionText, List<String> options, String correctAnswer){
        super(questionText);
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Here are the options: ");
        for(int i=0;i<options.size();i++){
            System.out.println("option "+(i+1)+": "+options.get(i));
        }
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        if(userAnswer.equals(correctAnswer)) {
            return true;
        }
        return  false;
    }

}
