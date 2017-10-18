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

//    int getArmor();
//    int getHealth();

    boolean isAlive();

    int applyDamage(int count);
    int applyMortalStrikes(int count);
}
