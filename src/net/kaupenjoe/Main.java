package net.kaupenjoe;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Outputting Things with println */

        System.out.println("Hello YouTube");

        int x = 10;
        System.out.println(x);

        System.out.println("Outputting some Value: " + x);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in your Username?!");
        String input = scanner.nextLine();

        System.out.println("Your Username is: " + input);
    }
}
