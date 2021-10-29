package net.kaupenjoe;

public class Main {

    public static void main(String[] args) {
        /* Numerical Types */

        // Mainly used
        int aNumber = 42;                   // Integer (or Whole Number) [-2,147,483,648 to 2,147,483,647]
        float aFloatingNumber = 13.37f;     // Floating point number  [7 decimal point precision]
        double aDoubleNumber = 420.0005;   // Double number  [15 decimal point precision]
        // 1.412 * 10^4 = 14120

        // Sometimes used
        byte aTinyNumber = 100; 			// One byte (or 8 bits) stores numbers from [-128 to 127]
        short aSmallNumber = 30000;			// short stores numbers from [-32,768 to 32,767]
        long aLongNumber = 50000000;		// Long (for really long numbers) [-9,223,372,036,854,775,808
        // to 9,223,372,036,854,775,807]

        /* Booleans (Logic) */

        boolean greatVideos = true;		// Store either true (1) or false (0)
        boolean isThisHTML = false;

        /* Characters & Strings */

        char aSingleCharacter = 'j';	// Stores a single Character. Can also include
        // special Characters like commas, dashes etc.

        String message = "Hello World";	// Store a sequence of characters.
        String test = null; // null is not 0, but literally empty. Has no value!
    }
}
