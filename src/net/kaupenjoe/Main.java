package net.kaupenjoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* EXERCISE & SOLUTION 2  */

        /*
         * Exercise 2:
         * a) Re-create the Trivia Game from before. This time with 5 Questions & 5 Answers!
         *  Use Arrays to save the question and answers.
         *  Create at least two methods that make the code more readable and easier to follow.
         *    --> Hint: Duplicate code can usually be made into methods
         *  BONUS:  Use an endless while loop with if statements so the user can play until they don't want anymore.
         *
         * OPTIONAL HARDER EXERCISE (Without Solution):
         * b) Create a very simple version of Tik Tak Toe
         *  Hints: Use one array to save the board. Think about what type of data you need!
         *         Use methods to properly print out each row of the board.
         *         Make it a two Player Game (making an AI is too advanced :P)
         *         You will need to use Loops here as well!
         *
         */

        String[] questions = new String[5];
        questions[0] = "How many States does the USA have?";
        questions[1] = "What is the Capital of the United Kingdom?";
        questions[2] = "What is the chemical symbol for Iron?";
        questions[3] = "How High is Mount Everest? (Answer in km)";
        questions[4] = "What is the Answer to Life, the Universe and Everything?";

        String[] answers = new String[5];
        answers[0] = "50";
        answers[1] = "London";
        answers[2] = "Fe";
        answers[3] = "8848";
        answers[4] = "42";

        Scanner scanner = new Scanner(System.in);
        int points = 0;

        while (true) {
            printTitle();

            for(int i = 0; i < questions.length; i++) {
                printQuestion(questions[i]);
                String userAnswer = scanner.next();

                if(isCorrectAnswer(userAnswer, answers[i])) {
                    printYouHadCorrect();
                    points = increasePointTotal(points);
                    printCurrentPoints(points);
                } else {
                    printYouHadIncorrect();
                    printTheCorrectAnswer(answers[i]);
                }
            }

            printPointTotal(points);
            printPlayAgain();
            if(scanner.next().equals("Y")) {
                points = 0;
                continue;
            } else {
                break;
            }
        }

        printGoodbye();
    }

    public static void printTitle() {
        System.out.println("KAUPEN-TRIVA");
    }

    public static int increasePointTotal(int points) {
        return points + 1;
    }

    public static void printCurrentPoints(int points) {
        System.out.println("You currently have " + points + " Points!");
    }

    public static void printPlayAgain() {
        System.out.println("Do you wanna play again? Y / N");
    }

    public static void printPointTotal(int points) {
        System.out.println("You had " + points + " Points!");
    }

    public static void printGoodbye() {
        System.out.println("Thank you very much for playing KAUPEN-TRIVIA");
    }

    public static void printQuestion(String question) {
        System.out.println(question);
    }

    public static boolean isCorrectAnswer(String userAnswer, String realAnswer) {
        return userAnswer.equals(realAnswer);
    }

    public static void printYouHadCorrect() {
        System.out.println("That was the correct Answer");
    }

    public static void printYouHadIncorrect() {
        System.out.println("That was the incorrect Answer!");
    }

    public static void printTheCorrectAnswer(String realAnswer) {
        System.out.println("The Correct Answer was: " + realAnswer);
    }
}
