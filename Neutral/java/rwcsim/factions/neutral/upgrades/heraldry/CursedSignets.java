package rwcsim.factions.neutral.upgrades.heraldry;

import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.stages.OnReceivingBane;
import rwcsim.basicutils.upgrade.Heraldry;

public class CursedSignets implements Cost, Heraldry, OnReceivingBane {
    @Override
    public int price() {
        return 2;
    }
}
