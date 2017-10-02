package rwcsim.factions.waiqar.upgrades.unique;

import rwcsim.base.systems.actions.AddSurge;
import rwcsim.base.systems.stages.OnMeleeAttack;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.HeroSpecific;
import rwcsim.factions.base.upgrades.Unique;
import rwcsim.factions.waiqar.ArdusIxErebus;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class ArdusFury implements Cost, Waiqar, HeroSpecific<ArdusIxErebus>, Unique, OnMeleeAttack, AddSurge {
    @Override
    public int addSurgeValue() {
        return 1;
    }

    @Override
    public int price() {
        return 1;
    }
}
