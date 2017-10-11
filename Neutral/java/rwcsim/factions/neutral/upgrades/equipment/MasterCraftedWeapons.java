package rwcsim.factions.neutral.upgrades.equipment;

import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.stages.SpendSurges;
import rwcsim.basicutils.upgrade.Equipment;

public class MasterCraftedWeapons implements Cost, Equipment, SpendSurges {

    @Override
    public int price() {
        return 4;
    }
}
