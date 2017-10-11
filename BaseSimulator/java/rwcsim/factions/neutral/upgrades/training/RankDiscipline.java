package rwcsim.factions.neutral.upgrades.training;

import rwcsim.factions.base.Cost;
import rwcsim.factions.base.abilities.Precise;
import rwcsim.factions.base.upgrades.Training;

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
