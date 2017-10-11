package rwcsim.factions.neutral.upgrades.artifact;

import rwcsim.base.systems.stages.TargetAttack;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.Artifact;
import rwcsim.factions.base.upgrades.Unique;

public class HeartSeeker implements Artifact, Cost, TargetAttack, Unique {
    @Override
    public int price() {
        return 10;
    }
}
