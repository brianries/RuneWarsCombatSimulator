package rwcsim.factions.neutral.upgrades.champion;

import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.stages.AfterCharge;
import rwcsim.basicutils.upgrade.Champion;

public class FileLeader implements Cost, Champion, AfterCharge {
    @Override
    public int price() {
        return 6;
    }
}
