package rwcsim.factions.daqan.upgrades.artifact;

import rwcsim.base.systems.stages.SpendSurges;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.Artifact;
import rwcsim.factions.base.upgrades.Unique;
import rwcsim.factions.base.upgrades.Upgrade;
import rwcsim.factions.daqan.upgrades.Daqan;

public class TheDawnBlade implements Upgrade, Artifact, Unique, Daqan, SpendSurges, Cost {
    @Override
    public int price() {
        return 10;
    }
}
