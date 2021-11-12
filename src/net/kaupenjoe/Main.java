package net.kaupenjoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* LOOPS */

        String[] questions = new String[3];
        questions[0] = "How many States does the USA have?";
        questions[1] = "What is the Capital of the United Kingdom";
        questions[2] = "What is the chemical symbol for Iron";

        String[] answers = new String[3];
        answers[0] = "50";
        answers[1] = "London";
        answers[2] = "Fe";

        for(int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(answers[i]);
        }

        // foreach
        for(String question : questions) {
            System.out.println(question);
        }

        Scanner scanner = new Scanner(System.in);

        // while loop AND this is endless!
        while(true) {
            System.out.println("Do you want to continue?");
            if(scanner.next().toLowerCase().equals("yes")) {
                continue;
            } else {
                break;
            }
        }
    }
}
