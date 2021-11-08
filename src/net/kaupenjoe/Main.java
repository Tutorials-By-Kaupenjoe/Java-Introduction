package net.kaupenjoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* IF AND ELSE STATEMENTS  */

        int exam1 = 65;
        int exam2 = 51;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Results for Exam 1: ");
        exam1 = scanner.nextInt();
        System.out.println("Results for Exam 2: ");
        exam2 = scanner.nextInt();
        
        if(exam1 >= 50) {
            System.out.println("You have passed exam 1");
        } else {
            System.out.println("You have FAILED exam 1");
        }

        if(exam2 >= 50) {
            System.out.println("You have passed exam 2");
        } else if(exam2 < 0) {
            System.out.println("How did you get negative points?!");
        } else {
            System.out.println("You have FAILED exam 2");
        }

        if(exam1 >= 50 && exam2 >= 50) {
            System.out.println("You have passed BOTH exams!");
        }
    }
}
