package rwcsim.factions.waiqar.upgrades.unique;

import rwcsim.base.systems.actions.AddSurge;
import rwcsim.base.systems.stages.OnMeleeAttack;
import rwcsim.factions.base.upgrades.HeroSpecific;
import rwcsim.factions.base.upgrades.Unique;
import rwcsim.factions.waiqar.ArdusIxErebus;

public class ArdusFury implements HeroSpecific<ArdusIxErebus>, Unique, OnMeleeAttack, AddSurge {
    @Override
    public int addSurgeValue() {
        return 1;
    }
}
