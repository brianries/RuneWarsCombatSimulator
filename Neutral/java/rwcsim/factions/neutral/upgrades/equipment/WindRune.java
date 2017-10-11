package rwcsim.factions.neutral.upgrades.equipment;

import rwcsim.basicutils.actions.OnSkill;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.Equipment;

public class WindRune implements Cost, Equipment, OnSkill {
    @Override
    public int price() {
        return 6;
    }
}
