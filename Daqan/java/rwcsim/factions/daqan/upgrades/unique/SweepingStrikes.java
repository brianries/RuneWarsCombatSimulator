package rwcsim.factions.daqan.upgrades.unique;

import rwcsim.basicutils.stages.OnMeleeAttack;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.HeroSpecific;
import rwcsim.basicutils.upgrade.Unique;
import rwcsim.factions.daqan.LordHawthorne;
import rwcsim.factions.daqan.upgrades.Daqan;

public class SweepingStrikes implements Cost, Daqan, HeroSpecific<LordHawthorne>, Unique, OnMeleeAttack {
    @Override
    public int price() {
        return 5;
    }
}
