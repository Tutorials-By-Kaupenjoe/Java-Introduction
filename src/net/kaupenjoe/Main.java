package net.kaupenjoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* EXCEPTIONS AND TRY & CATCH */

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        // checkForZero(i);

        // IN GENERAL:
        // YOU WANT THE CODE TO FAIL LOUD!

        int z = scanner.nextInt();

        try {
            checkForZero(z);
        } catch (Exception e) {
            // Do something about this exception
            System.out.println("Caught Exception " + e.getMessage());
        } finally {
            // Doing something is happening regardless of caught or not
            System.out.println("Finally");
        }

        System.out.println("This happens always!");
    }

    private static void checkForZero(int number) throws TestException {
        if(number == 0) {
            throw new TestException("NUMBER IS ZERO!");
        }
    }
}
