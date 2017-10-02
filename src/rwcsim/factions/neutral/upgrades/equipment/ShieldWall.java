package rwcsim.factions.neutral.upgrades.equipment;

import rwcsim.base.systems.stages.WhileDefending;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.Equipment;

public class ShieldWall implements Cost, Equipment, WhileDefending {
    @Override
    public int price() {
        return 5;
    }
}
