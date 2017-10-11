package rwcsim.factions.neutral.upgrades.training;

import rwcsim.base.systems.stages.OnAttack;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.Training;

public class CloseQuarterTargeting implements Cost, Training, OnAttack {
    @Override
    public int price() {
        return 3;
    }
}
