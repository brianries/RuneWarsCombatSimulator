package rwcsim.factions.neutral.upgrades.artifact;

import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.stages.AfterDefending;
import rwcsim.basicutils.upgrade.Artifact;
import rwcsim.basicutils.upgrade.Unique;

public class ShieldOfMargath implements Artifact, AfterDefending, Cost, Unique {
    @Override
    public int price() {
        return 6;
    }
}
