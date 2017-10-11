package rwcsim.factions.neutral.upgrades.artifact;

import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.stages.Exhaustable;
import rwcsim.basicutils.stages.ModifyDice;
import rwcsim.basicutils.upgrade.Artifact;
import rwcsim.basicutils.upgrade.Unique;

public class FortunasDice implements Cost, Artifact, ModifyDice, Unique, Exhaustable {
    @Override
    public int price() {
        return 6;
    }
}
