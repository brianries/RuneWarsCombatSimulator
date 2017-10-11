package rwcsim.factions.daqan.upgrades.artifact;

import rwcsim.basicutils.stages.SpendSurges;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.Artifact;
import rwcsim.basicutils.upgrade.Unique;
import rwcsim.basicutils.upgrade.Upgrade;
import rwcsim.factions.daqan.upgrades.Daqan;

public class TheDawnBlade implements Upgrade, Artifact, Unique, Daqan, SpendSurges, Cost {
    @Override
    public int price() {
        return 10;
    }
}
