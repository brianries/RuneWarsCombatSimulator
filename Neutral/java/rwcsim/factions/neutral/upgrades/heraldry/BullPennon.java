package rwcsim.factions.neutral.upgrades.heraldry;

import rwcsim.basicutils.abilities.Impact;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.Heraldry;

public class BullPennon implements Cost, Heraldry, Impact {
    @Override
    public int getImpactValue() {
        return 1;
    }

    @Override
    public int price() {
        return 3;
    }
}
