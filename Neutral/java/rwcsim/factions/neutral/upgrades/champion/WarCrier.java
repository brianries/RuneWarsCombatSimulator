package rwcsim.factions.neutral.upgrades.champion;

import rwcsim.basicutils.actions.OnSkill;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.Champion;

public class WarCrier implements Cost, Champion, OnSkill {
    @Override
    public int price() {
        return 5;
    }
}
