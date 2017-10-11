package rwcsim.factions.waiqar.upgrades.artifact;

import rwcsim.basicutils.stages.SpendSurges;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.Artifact;
import rwcsim.basicutils.upgrade.Unique;
import rwcsim.basicutils.upgrade.Upgrade;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class TheDuskBlade implements Cost, Upgrade, Artifact, Unique, Waiqar, SpendSurges {
    @Override
    public int price() {
        return 8;
    }
}
