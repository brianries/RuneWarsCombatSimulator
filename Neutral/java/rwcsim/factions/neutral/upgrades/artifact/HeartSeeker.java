package rwcsim.factions.neutral.upgrades.artifact;

import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.stages.TargetAttack;
import rwcsim.basicutils.upgrade.Artifact;
import rwcsim.basicutils.upgrade.Unique;

public class HeartSeeker implements Artifact, Cost, TargetAttack, Unique {
    @Override
    public int price() {
        return 10;
    }
}
