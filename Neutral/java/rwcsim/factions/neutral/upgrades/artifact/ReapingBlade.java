package rwcsim.factions.neutral.upgrades.artifact;

import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.stages.SpendMortalStrikes;
import rwcsim.basicutils.upgrade.Artifact;
import rwcsim.basicutils.upgrade.Unique;

public class ReapingBlade implements Artifact, Cost, SpendMortalStrikes, Unique {
    @Override
    public int price() {
        return 4;
    }
}
