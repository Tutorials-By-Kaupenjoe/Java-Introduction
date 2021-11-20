package net.kaupenjoe;

import net.kaupenjoe.banking.Bank;
import net.kaupenjoe.banking.Person;
import net.kaupenjoe.trivia.TriviaGame;

public class Main {
    public static void main(String[] args) {
        /*
         * Exercise 3:
         * a) Trivia Game with CLASSES and Objects:
         * Modify the Trivia Game we have made in the previous two exercises in such a way to use Classes as well.
         * Imagine possible making custom classes for Question Answer Pairs, using Lists to save them
         *
         * b) Bank Management System:
         * Create a Bank Management System which has the following components:
         * Person (which saves first, middle and last name, age and a "social security number")
         * Bank (which saves a List of customers and their Checking Accounts, maximum overdraw amount)
         * Checking Account (should have a current value, methods for taking and depositing money)
         * Opening a Checking Account should only work via a Bank and must require a certain amount of initial deposit.
         *
         * BONUS: Make the Banking System Interactive (No Solution provided!)
         *
         *
         */

        Person nano = new Person("Nano", "Attack", 8);
        Person daniel = new Person("Daniel", "Smith", 24);
        Person marie = new Person("Marie", "Susan", "Jones", 28);

        Bank kb = new Bank("KaupenBank");
        kb.openBankAccount(nano, 200); // Not old Enough

        kb.openBankAccount(marie, 2000);
        kb.openBankAccount(daniel, 10); // Deposit is not enough

        System.out.println(kb.getAccountByPerson(marie).getBalance()); // 2000
        kb.withdrawAmount(3000, marie); // Cannot withdraw over the limit!



        // Uncomment both to play game!
        // TriviaGame game = new TriviaGame();
        // game.startGame();

    }
}
