package rwcsim.factions.neutral.upgrades.equipment;

import rwcsim.base.systems.actions.OnSkill;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.Equipment;

public class FireRune implements Cost, Equipment, OnSkill {
    @Override
    public int price() {
        return 7;
    }
}
