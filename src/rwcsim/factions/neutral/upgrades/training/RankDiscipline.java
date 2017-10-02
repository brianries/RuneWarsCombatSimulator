package rwcsim.factions.neutral.upgrades.training;

import rwcsim.factions.base.abilities.Precise;
import rwcsim.factions.base.upgrades.Training;

public class RankDiscipline implements Training, Precise {
    @Override
    public int additionalRanks() {
        return 1;
    }
}
