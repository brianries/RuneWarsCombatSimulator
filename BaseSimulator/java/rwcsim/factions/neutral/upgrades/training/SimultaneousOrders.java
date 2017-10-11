package rwcsim.factions.neutral.upgrades.training;

import rwcsim.base.systems.actions.OnSkill;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.Training;

public class SimultaneousOrders implements Cost, Training, OnSkill {
    @Override
    public int price() {
        return 2;
    }
}
