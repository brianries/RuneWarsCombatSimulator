package rwcsim.factions.neutral.upgrades.equipment;

import rwcsim.base.systems.stages.Exhaustable;
import rwcsim.base.systems.stages.SpendSurges;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.Equipment;

public class TemperedSteel implements Cost, Equipment, SpendSurges, Exhaustable {
    @Override
    public int price() {
        return 3;
    }
}
