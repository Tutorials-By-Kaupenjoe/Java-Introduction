package net.kaupenjoe;

public class Main {
    public static void main(String[] args) {
        /* ENUMS */

        Difficulty gameDifficulty = Difficulty.MEDIUM;
        gameDifficulty = Difficulty.HARD;

        ToolTier tier = ToolTier.DIAMOND;
        System.out.println(tier.getAttackMultiplier());
    }
}
