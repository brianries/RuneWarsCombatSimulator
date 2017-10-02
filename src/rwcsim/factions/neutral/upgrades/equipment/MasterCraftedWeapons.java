package rwcsim.factions.neutral.upgrades.equipment;

import rwcsim.base.systems.stages.SpendSurges;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.Equipment;

public class MasterCraftedWeapons implements Cost, Equipment, SpendSurges {

    @Override
    public int price() {
        return 4;
    }
}
