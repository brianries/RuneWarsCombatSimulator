package rwcsim.factions.latari.upgrades.unique;

import rwcsim.base.systems.stages.OnMeleeAttack;
import rwcsim.base.systems.stages.WhileDefending;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.HeroSpecific;
import rwcsim.factions.base.upgrades.Unique;
import rwcsim.factions.latari.AlianaOfSummersong;
import rwcsim.factions.latari.upgrades.Latari;

public class AmbushPredator implements Cost, Latari, HeroSpecific<AlianaOfSummersong>, Unique, WhileDefending, OnMeleeAttack {
    @Override
    public int price() {
        return 3;
    }
}
