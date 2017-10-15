package rwcsim.basicutils.concepts;

public interface Figure {
    default boolean isUpgrade() {
        return false;
    }
    default int getArmor() {
        return 1;
    }
    default int getHealth() {
        return 1;
    }

    boolean isAlive();

    int applyDamage(int count);
    void setInitialHealth();
}
