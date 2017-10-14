package rwcsim.factions.neutral.upgrades.training;

import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.stages.WhileDefending;
import rwcsim.basicutils.upgrades.Training;

public class FlankGuards implements Cost, Training, WhileDefending {
    @Override
    public int price() {
        return 5;
    }
}
