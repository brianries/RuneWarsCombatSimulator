package rwcsim.factions.daqan.upgrades.unique;

import rwcsim.base.systems.stages.WhileDefending;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.HeroSpecific;
import rwcsim.factions.base.upgrades.Unique;
import rwcsim.factions.daqan.LordHawthorne;
import rwcsim.factions.daqan.upgrades.Daqan;

public class MightOfDaqan implements Cost, Daqan, HeroSpecific<LordHawthorne>, Unique, WhileDefending {
    @Override
    public int price() {
        return 4;
    }
}
