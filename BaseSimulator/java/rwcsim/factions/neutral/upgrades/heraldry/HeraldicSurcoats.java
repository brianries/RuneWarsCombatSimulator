package rwcsim.factions.neutral.upgrades.heraldry;

import rwcsim.base.systems.stages.OnMoraleTest;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.Heraldry;

public class HeraldicSurcoats implements Cost, Heraldry, OnMoraleTest {
    @Override
    public int price() {
        return 5;
    }
}
