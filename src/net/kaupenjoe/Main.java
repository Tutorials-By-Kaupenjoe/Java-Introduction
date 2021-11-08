package net.kaupenjoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* EXERCISE 1 */

        /*
         * CREATE A SIMPLE TRIVIA GAME
         *
         * Define (at least) three questions with three answers.
         * Prompt the User the type in their answer using the Scanner, you've seen in the output/input video
         * Then use if/else statements to check if the answer from the user is correct! And output that they were.
         * If they were wrong, tell the user and output the correct answer.
         *
         * BONUS: increment a points total each time the user is correct and at the end make a unique output for each
         * score the user might have (0 to 3)
         *
         * IMPORTANT TIPS:
         * 1. When reading in Strings from the user use scanner.next() (NOT scanner.nextLine())
         * 2. When you have an answer and input that are both strings you will have to use:
         *    userInput.equals(answer) instead of userInput == answer
         */

        String question1 = "How many States does the USA have?";
        String question2 = "What is the Capital of the United Kingdom";
        String question3 = "What is the chemical symbol for Iron";

        int answer1 = 50;
        String answer2 = "London";
        String answer3 = "Fe";

        int points = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println(question1);
        int userInput1 = scanner.nextInt();

        if(userInput1 == answer1) {
            points++;
            System.out.println("Your answer was correct! You have " + points + " points.");
        } else {
            System.out.println("Incorrect! The correct answer is: " + answer1);
        }

        System.out.println("");
        System.out.println(question2);
        String userInput2 = scanner.next();

        if(userInput2.equals(answer2)) {
            points++;
            System.out.println("Your answer was correct! You have " + points + " points.");
        } else {
            System.out.println("Incorrect! The correct answer is: " + answer2);
        }

        System.out.println("");
        System.out.println(question3);
        String userInput3 = scanner.next();

        if(userInput3.equals(answer3)) {
            points++;
            System.out.println("Your answer was correct! You have " + points + " points.");
        } else {
            System.out.println("Incorrect! The correct answer is: " + answer3);
        }

        if(points == 3) {
            System.out.println("You are a genius! Everything correct!");
        } else if (points == 2) {
            System.out.println("You are pretty smart. Only one mistake!");
        } else if (points == 1) {
            System.out.println("You are okay. Made two mistakes. It can happen to anyone!");
        } else if (points == 0) {
            System.out.println("You... you got everything wrong!");
        } else if (points < 0) {
            System.out.println("HOW DID YOU EVEN GET NEGATIVE POINTS?!");
        }
    }
}
