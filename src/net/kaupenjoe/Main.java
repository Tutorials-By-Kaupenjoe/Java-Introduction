package net.kaupenjoe;

public class Main {
    public static void main(String[] args) {
        /* BOOLEAN AND LOGICAL OPERATORS */

        boolean likedThisVideo = true;
        boolean commented = true;
        boolean dislikedThisVideo = false;

        // Logical Operators
        // && (AND)
        // || (OR)
        // !  (NOT / NEGATION)

        boolean superFan = likedThisVideo && commented; // FALSE, because commented is NOT True
        boolean fan = likedThisVideo || commented; // True, because ONE of them is true
        boolean hater = !fan; // TRUE, because we negate superFan
        boolean superHater = hater && dislikedThisVideo;

        superHater = !(likedThisVideo || commented) && dislikedThisVideo;
    }
}
