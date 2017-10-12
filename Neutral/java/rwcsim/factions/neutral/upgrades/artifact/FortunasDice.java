package rwcsim.factions.neutral.upgrades.artifact;

import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.modifiers.AddStage;
import rwcsim.basicutils.modifiers.Exhaustable;
import rwcsim.basicutils.stages.ModifyDice;
import rwcsim.basicutils.upgrade.Artifact;
import rwcsim.basicutils.upgrade.Unique;

public class FortunasDice implements Cost, Artifact, AddStage<ModifyDice>, Unique, Exhaustable {
    @Override
    public int price() {
        return 6;
    }

    @Override
    public ModifyDice getStage() {
        return null;
    }
}
