package rwcsim.factions.latari.upgrades.unique;

import rwcsim.base.dials.DialFace;
import rwcsim.base.dials.Face;
import rwcsim.base.systems.stages.OnMarch;
import rwcsim.base.systems.stages.OnShift;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.HeroSpecific;
import rwcsim.factions.base.upgrades.Unique;
import rwcsim.factions.latari.AlianaOfSummersong;
import rwcsim.factions.latari.upgrades.Latari;

public class WildcallsInstinct implements Cost, Latari, HeroSpecific<AlianaOfSummersong>, Unique, OnMarch, OnShift {
    @Override
    public DialFace applyModifier() {
        return new DialFace(Face.MOVE_MOD_TURN);
    }

    @Override
    public int price() {
        return 2;
    }
}
