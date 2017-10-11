package rwcsim.factions.waiqar.upgrades.unique;

import rwcsim.factions.base.Cost;
import rwcsim.factions.base.abilities.Precise;
import rwcsim.factions.base.upgrades.HeroSpecific;
import rwcsim.factions.base.upgrades.Unique;
import rwcsim.factions.waiqar.ArdusIxErebus;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class AncientTechnique implements Cost, Waiqar,HeroSpecific<ArdusIxErebus>, Unique, Precise {
    @Override
    public int additionalRanks() {
        return 1;
    }

    @Override
    public int price() {
        return 2;
    }
}
