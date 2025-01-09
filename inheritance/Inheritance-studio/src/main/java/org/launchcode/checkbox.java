package org.launchcode;

import java.util.List;

public class checkbox extends  questions{
    private List<String> options;
    private List<Integer> correctAnswers;

    public checkbox(String questionText, List<String> options, List<Integer> correctAnswers){
    super(questionText);
    this.options = options;
    this.correctAnswers = correctAnswers;
    }

    @Override
    public void display() {
        super.display();
        for(int i=0;i<options.size();i++){
            System.out.println("option "+(i+1)+": "+options.get(i));
        }
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        String[] answers = userAnswer.split(",");
        for(String a : answers){
            if(!correctAnswers.contains(Integer.parseInt(a)))
                return false;
        }
        return  true;
    }
}
