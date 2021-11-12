package net.kaupenjoe;

public class Main {
    public static void main(String[] args) {
        /* ARRAYS */

        String question1 = "How many States does the USA have?";
        String question2 = "What is the Capital of the United Kingdom";
        String question3 = "What is the chemical symbol for Iron";

        String answer1 = "50";
        String answer2 = "London";
        String answer3 = "Fe";

        String[] questions = new String[3];
        questions[0] = "How many States does the USA have?";
        questions[1] = "What is the Capital of the United Kingdom";
        questions[2] = "What is the chemical symbol for Iron";

        String[] answers = new String[3];
        answers[0] = "50";
        answers[1] = "London";
        answers[2] = "Fe";

        System.out.println(questions[0]);
        System.out.println(answers[0]);

        questions[0] = "How old is Ewan McGregor (in 2021)?";
        System.out.println(questions[0]);
        System.out.println(answers[0]);

        System.out.println(questions.length);

        // ArrayIndexOutOfBoundsException (Uncomment line below)
        // System.out.println(questions[3]);

    }
}
