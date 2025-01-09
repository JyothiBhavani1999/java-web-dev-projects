package org.launchcode;

public abstract class questions {
    private String questionText;

    public questions(String questionText){
        this.questionText = questionText;
    }

    public void display(){
        System.out.println("Here is the question: "+questionText);
    }
    public abstract boolean checkAnswer(String userAnswer);
}
