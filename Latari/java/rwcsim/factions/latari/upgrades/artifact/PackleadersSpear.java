package rwcsim.factions.latari.upgrades.artifact;

import rwcsim.basicutils.modifiers.Exhaustable;
import rwcsim.basicutils.stages.OnMeleeAttack;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.Artifact;
import rwcsim.basicutils.upgrade.Unique;
import rwcsim.factions.latari.upgrades.Latari;

public class PackleadersSpear implements Cost, Latari, Artifact, Unique, Exhaustable, OnMeleeAttack {
    @Override
    public int price() {
        return 8;
    }
}
