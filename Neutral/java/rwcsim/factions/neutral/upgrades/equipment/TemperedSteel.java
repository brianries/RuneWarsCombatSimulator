package rwcsim.factions.neutral.upgrades.equipment;

import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.modifiers.Exhaustable;
import rwcsim.basicutils.stages.SpendSurges;
import rwcsim.basicutils.upgrade.Equipment;

public class TemperedSteel implements Cost, Equipment, SpendSurges, Exhaustable {
    @Override
    public int price() {
        return 3;
    }
}
