package rwcsim.factions.waiqar.upgrades.training;

import rwcsim.base.systems.stages.SpendSurges;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.Training;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class CombatIngenuity implements Cost, Waiqar, Training, SpendSurges {
    @Override
    public int price() {
        return 6;
    }
}
