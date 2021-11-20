package net.kaupenjoe;

public enum ToolTier {
    DIAMOND(10, 2),
    NETHERITE(100, 4);

    private final int attackMultiplier;
    private final int attackSpeed;

    ToolTier(int attackMultiplier, int attackSpeed) {
        this.attackMultiplier = attackMultiplier;
        this.attackSpeed = attackSpeed;
    }

    public int getAttackMultiplier() {
        return attackMultiplier;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }
}
