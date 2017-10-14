package rwcsim.basicutils.concepts;

import rwcsim.basicutils.upgrades.Upgrade;

public interface EffectUpgrade extends Upgrade {
    default boolean isEffectUpgrade() {
        return true;
    }
}
