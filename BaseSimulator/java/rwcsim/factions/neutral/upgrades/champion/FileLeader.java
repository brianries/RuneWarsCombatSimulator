package rwcsim.factions.neutral.upgrades.champion;

import rwcsim.base.systems.stages.AfterCharge;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.Champion;

public class FileLeader implements Cost, Champion, AfterCharge {
    @Override
    public int price() {
        return 6;
    }
}
