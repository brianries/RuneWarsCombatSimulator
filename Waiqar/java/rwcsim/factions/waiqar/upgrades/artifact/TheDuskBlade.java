package rwcsim.factions.waiqar.upgrades.artifact;

import rwcsim.base.systems.stages.SpendSurges;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.Artifact;
import rwcsim.factions.base.upgrades.Unique;
import rwcsim.factions.base.upgrades.Upgrade;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class TheDuskBlade implements Cost, Upgrade, Artifact, Unique, Waiqar, SpendSurges {
    @Override
    public int price() {
        return 8;
    }
}
