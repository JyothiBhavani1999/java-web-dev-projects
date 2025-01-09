package org.launchcode;

public class TrueOrFalse extends questions{
    private String correctAnswer;


    public TrueOrFalse(String questionText, String correctAnswer){
        super(questionText);
        this.correctAnswer = correctAnswer;

    }

    @Override
    public void display() {
        super.display();
        System.out.println("1.true");
        System.out.println("2.false");
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        return userAnswer == correctAnswer;
    }
}
