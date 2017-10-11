package rwcsim.factions.neutral.upgrades.training;

import rwcsim.basicutils.abilities.Precise;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.Training;

public class RankDiscipline implements Cost, Training, Precise {
    @Override
    public int additionalRanks() {
        return 1;
    }

    @Override
    public int price() {
        return 4;
    }
}
