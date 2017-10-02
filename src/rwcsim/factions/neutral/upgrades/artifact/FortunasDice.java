package rwcsim.factions.neutral.upgrades.artifact;

import rwcsim.base.systems.stages.Exhaustable;
import rwcsim.base.systems.stages.ModifyDice;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.Artifact;
import rwcsim.factions.base.upgrades.Unique;

public class FortunasDice implements Cost, Artifact, ModifyDice, Unique, Exhaustable {
    @Override
    public int price() {
        return 6;
    }
}
