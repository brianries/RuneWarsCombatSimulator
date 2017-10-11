package rwcsim.factions.latari.upgrades.unique;

import rwcsim.basicutils.stages.OnMeleeAttack;
import rwcsim.basicutils.stages.WhileDefending;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.HeroSpecific;
import rwcsim.basicutils.upgrade.Unique;
import rwcsim.factions.latari.AlianaOfSummersong;
import rwcsim.factions.latari.upgrades.Latari;

public class AmbushPredator implements Cost, Latari, HeroSpecific<AlianaOfSummersong>, Unique, WhileDefending, OnMeleeAttack {
    @Override
    public int price() {
        return 3;
    }
}
