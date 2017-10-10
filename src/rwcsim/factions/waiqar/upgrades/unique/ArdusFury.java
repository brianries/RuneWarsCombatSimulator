package rwcsim.factions.waiqar.upgrades.unique;

import rwcsim.base.systems.actions.AddSurges;
import rwcsim.base.systems.stages.OnMeleeAttack;
import rwcsim.factions.base.upgrades.HeroSpecific;
import rwcsim.factions.base.upgrades.Unique;
import rwcsim.factions.base.upgrades.Upgrade;
import rwcsim.factions.waiqar.ArdusIxErebus;

public class ArdusFury implements Upgrade, HeroSpecific<ArdusIxErebus>, Unique, OnMeleeAttack, AddSurges {

    @Override
    public int getSurges() {
        return 1;
    }
}
