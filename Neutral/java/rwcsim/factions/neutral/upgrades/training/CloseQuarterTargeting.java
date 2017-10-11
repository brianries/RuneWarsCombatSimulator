package rwcsim.factions.neutral.upgrades.training;

import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.stages.OnAttack;
import rwcsim.basicutils.upgrade.Training;

public class CloseQuarterTargeting implements Cost, Training, OnAttack {
    @Override
    public int price() {
        return 3;
    }
}
