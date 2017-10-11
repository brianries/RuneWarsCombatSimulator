package rwcsim.factions.daqan.upgrades.unique;

import rwcsim.basicutils.stages.WhileDefending;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.HeroSpecific;
import rwcsim.basicutils.upgrade.Unique;
import rwcsim.factions.daqan.LordHawthorne;
import rwcsim.factions.daqan.upgrades.Daqan;

public class MightOfDaqan implements Cost, Daqan, HeroSpecific<LordHawthorne>, Unique, WhileDefending {
    @Override
    public int price() {
        return 4;
    }
}
