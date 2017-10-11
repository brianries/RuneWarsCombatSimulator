package rwcsim.factions.neutral.upgrades.equipment;

import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.stages.WhileDefending;
import rwcsim.basicutils.upgrade.Equipment;

public class ShieldWall implements Cost, Equipment, WhileDefending {
    @Override
    public int price() {
        return 5;
    }
}
