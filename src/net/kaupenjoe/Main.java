package net.kaupenjoe;

public class Main {
    public static void main(String[] args) {
        /* TERNARY OPERATOR */

        int exam = 65;
        int gift = 0;

        if(exam >= 50) {
            gift = 10;
        } else {
            gift = 0;
        }
        System.out.println(gift);

        gift = (exam >= 50) ? 10 : 0;
        System.out.println(gift);
    }
}
