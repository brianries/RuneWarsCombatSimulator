package rwcsim.factions.daqan.upgrades.unique;

import rwcsim.base.systems.stages.OnRangedAttack;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.HeroSpecific;
import rwcsim.factions.base.upgrades.Unique;
import rwcsim.factions.daqan.KariWraithstalker;
import rwcsim.factions.daqan.upgrades.Daqan;

public class LatariTraining implements Cost, Daqan, HeroSpecific<KariWraithstalker>, Unique, OnRangedAttack {
    @Override
    public int price() {
        return 6;
    }
}
