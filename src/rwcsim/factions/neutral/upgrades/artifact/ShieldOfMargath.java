package rwcsim.factions.neutral.upgrades.artifact;

import rwcsim.base.systems.stages.AfterDefending;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.Artifact;
import rwcsim.factions.base.upgrades.Unique;

public class ShieldOfMargath implements Artifact, AfterDefending, Cost, Unique {
    @Override
    public int price() {
        return 6;
    }
}
