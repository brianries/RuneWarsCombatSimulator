package rwcsim.basicutils.upgrades;

public interface Upgrade {
    default boolean isUpgrade() {
        return true;
    }
}
