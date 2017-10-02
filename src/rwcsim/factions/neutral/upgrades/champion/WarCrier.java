package rwcsim.factions.neutral.upgrades.champion;

import rwcsim.base.systems.actions.OnSkill;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.Champion;

public class WarCrier implements Cost, Champion, OnSkill {
    @Override
    public int price() {
        return 5;
    }
}
