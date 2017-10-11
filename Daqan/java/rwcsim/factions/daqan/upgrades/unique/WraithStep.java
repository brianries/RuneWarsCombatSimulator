package rwcsim.factions.daqan.upgrades.unique;

import rwcsim.basicutils.actions.OnSkill;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.HeroSpecific;
import rwcsim.basicutils.upgrade.Unique;
import rwcsim.factions.daqan.KariWraithstalker;
import rwcsim.factions.daqan.upgrades.Daqan;

public class WraithStep implements Cost, Daqan, HeroSpecific<KariWraithstalker>, Unique, OnSkill {
    @Override
    public int price() {
        return 1;
    }
}
