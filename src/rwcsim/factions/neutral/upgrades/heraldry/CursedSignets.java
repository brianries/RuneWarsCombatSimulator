package rwcsim.factions.neutral.upgrades.heraldry;

import rwcsim.base.systems.stages.OnReceivingBane;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.Heraldry;

public class CursedSignets implements Cost, Heraldry, OnReceivingBane {
    @Override
    public int price() {
        return 2;
    }
}
