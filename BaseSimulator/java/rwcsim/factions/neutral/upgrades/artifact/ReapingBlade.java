package rwcsim.factions.neutral.upgrades.artifact;

import rwcsim.base.systems.stages.SpendMortalStrikes;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.Artifact;
import rwcsim.factions.base.upgrades.Unique;

public class ReapingBlade implements Artifact, Cost, SpendMortalStrikes, Unique {
    @Override
    public int price() {
        return 4;
    }
}
