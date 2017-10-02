package rwcsim.factions.latari.upgrades.artifact;

import rwcsim.base.systems.stages.Exhaustable;
import rwcsim.base.systems.stages.OnMeleeAttack;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.Artifact;
import rwcsim.factions.base.upgrades.Unique;
import rwcsim.factions.latari.upgrades.Latari;

public class PackleadersSpear implements Cost, Latari, Artifact, Unique, Exhaustable, OnMeleeAttack {
    @Override
    public int price() {
        return 8;
    }
}
