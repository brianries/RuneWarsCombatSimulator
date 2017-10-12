package rwcsim.factions.neutral.upgrades.artifact;

import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.modifiers.AddStages;
import rwcsim.basicutils.modifiers.Exhaustable;
import rwcsim.basicutils.stages.ModifyDice;
import rwcsim.basicutils.unit.Unit;
import rwcsim.basicutils.upgrade.Artifact;
import rwcsim.basicutils.upgrade.Unique;

public class FortunasDice implements Cost, Artifact, AddStages, ModifyDice, Unique, Exhaustable {
    @Override
    public int price() {
        return 6;
    }


    @Override
    public void registerStages(Unit unit) {

    }
}
