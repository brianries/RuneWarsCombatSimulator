package rwcsim.factions.neutral.upgrades.heraldry;

import rwcsim.factions.base.Cost;
import rwcsim.factions.base.abilities.Impact;
import rwcsim.factions.base.upgrades.Heraldry;

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
