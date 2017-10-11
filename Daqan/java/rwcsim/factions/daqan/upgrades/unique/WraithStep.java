package rwcsim.factions.daqan.upgrades.unique;

import rwcsim.base.systems.actions.OnSkill;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.HeroSpecific;
import rwcsim.factions.base.upgrades.Unique;
import rwcsim.factions.daqan.KariWraithstalker;
import rwcsim.factions.daqan.upgrades.Daqan;

public class WraithStep implements Cost, Daqan, HeroSpecific<KariWraithstalker>, Unique, OnSkill {
    @Override
    public int price() {
        return 1;
    }
}
