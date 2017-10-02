package rwcsim.factions.neutral.upgrades.champion;

import rwcsim.base.systems.stages.Exhaustable;
import rwcsim.base.systems.actions.OnSkill;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.Champion;

public class DispatchRunner implements Champion, Cost, Exhaustable, OnSkill {
    @Override
    public int price() {
        return 7;
    }
}
