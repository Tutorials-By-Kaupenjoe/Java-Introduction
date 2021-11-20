package net.kaupenjoe.trivia;

public class Trivia {
    public String question;
    public String answer;

    public Trivia(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    // Making this lower case to make sure that input can be any casing
    public boolean isCorrectAnswer(String input) {
        input = input.toLowerCase();

        return this.answer.toLowerCase().equals(input);
    }

    public void printQuestion() {
        System.out.println(question);
    }

    public void printAnswer() {
        System.out.println(answer);
    }

    public boolean validateAnswer(String input) {
        boolean valid = isCorrectAnswer(input);

        if(valid) {
            printCorrect();
        } else {
            printIncorrect();
            printCorrectAnswer();
        }

        return valid;
    }

    private void printCorrect() {
        System.out.println("That was the correct Answer");
    }

    private void printIncorrect() {
        System.out.println("That was the incorrect Answer!");
    }

    private void printCorrectAnswer() {
        System.out.println("The Correct Answer was: " + this.answer);
    }
}
