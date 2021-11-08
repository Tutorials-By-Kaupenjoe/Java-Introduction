package net.kaupenjoe;

public class Main {
    public static void main(String[] args) {
        /* BOOLEAN AND COMPARISON OPERATORS  */

        boolean likedThisVideo = true;
        boolean commented = true;

        System.out.println("You have liked this video " + likedThisVideo);
        System.out.println("You have commented on this video " + commented);

        // Comparison Operators
        // > >= == != < <=

        int yourScore = 98;

        boolean passedClass = yourScore >= 50; // true, because 98 >= 50
        System.out.println("You passed: " + passedClass + " with " + yourScore + " points!");

        boolean hasPerfectScore = yourScore == 100; // false, because 98 is NOT equal to 100
        System.out.println("You have a perfect score? " + hasPerfectScore);

        boolean failedClass = passedClass == false;
        failedClass = !passedClass; // Negating a variable with the exclamation mark
        // true -> false
        // false -> true
    }
}
