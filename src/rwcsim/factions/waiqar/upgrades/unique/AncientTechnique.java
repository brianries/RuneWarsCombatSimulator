package rwcsim.factions.waiqar.upgrades.unique;

import rwcsim.factions.base.abilities.Precise;
import rwcsim.factions.base.upgrades.HeroSpecific;
import rwcsim.factions.base.upgrades.Unique;
import rwcsim.factions.waiqar.ArdusIxErebus;

public class AncientTechnique implements HeroSpecific<ArdusIxErebus>, Unique, Precise {
    @Override
    public int additionalRanks() {
        return 1;
    }
}
