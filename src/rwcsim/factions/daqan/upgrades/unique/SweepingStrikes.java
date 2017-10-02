package rwcsim.factions.daqan.upgrades.unique;

import rwcsim.base.states.UnavailableState;
import rwcsim.base.systems.stages.OnMeleeAttack;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.HeroSpecific;
import rwcsim.factions.base.upgrades.Unique;
import rwcsim.factions.daqan.LordHawthorne;
import rwcsim.factions.daqan.upgrades.Daqan;

public class SweepingStrikes implements Cost, Daqan, HeroSpecific<LordHawthorne>, Unique, OnMeleeAttack {
    @Override
    public int price() {
        return 5;
    }
}
