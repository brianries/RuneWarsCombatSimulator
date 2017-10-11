package rwcsim.factions.neutral.upgrades.training;

import rwcsim.base.systems.stages.WhileDefending;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.Training;

public class FlankGuards implements Cost, Training, WhileDefending {
    @Override
    public int price() {
        return 5;
    }
}
