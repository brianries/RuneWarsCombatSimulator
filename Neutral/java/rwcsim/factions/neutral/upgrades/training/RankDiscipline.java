package rwcsim.factions.neutral.upgrades.training;

import rwcsim.basicutils.abilities.Precise;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.modifiers.AddAbility;
import rwcsim.basicutils.upgrade.Training;

public class RankDiscipline implements Cost, Training, AddAbility<Precise> {
    @Override
    public int price() {
        return 4;
    }

    @Override
    public Precise getAbility() {
        return Precise.asAbility(1);
    }
}
