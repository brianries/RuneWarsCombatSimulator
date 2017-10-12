package rwcsim.factions.latari.upgrades.unique;

import rwcsim.basicutils.concepts.Stage;
import rwcsim.basicutils.modifiers.AddStages;
import rwcsim.basicutils.stages.OnMeleeAttack;
import rwcsim.basicutils.stages.WhileDefending;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.unit.Unit;
import rwcsim.basicutils.upgrade.HeroSpecific;
import rwcsim.basicutils.upgrade.Unique;
import rwcsim.factions.latari.AlianaOfSummersong;
import rwcsim.factions.latari.upgrades.Latari;

import java.util.List;

public class AmbushPredator implements Cost, Latari, HeroSpecific<AlianaOfSummersong>, Unique, AddStages {
    @Override
    public int price() {
        return 3;
    }

    @Override
    public void registerStages(Unit unit) {
//        <WhileDefending, OnMeleeAttack>
    }
}
