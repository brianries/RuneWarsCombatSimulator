package rwcsim.factions.latari.upgrades.unique;

import rwcsim.base.dials.DialFace;
import rwcsim.base.dials.Face;
import rwcsim.base.systems.stages.OnMarch;
import rwcsim.base.systems.stages.OnShift;
import rwcsim.factions.base.upgrades.HeroSpecific;
import rwcsim.factions.base.upgrades.Unique;
import rwcsim.factions.latari.AlianaOfSummersong;

public class WildcallsInstinct implements HeroSpecific<AlianaOfSummersong>, Unique, OnMarch, OnShift {
    @Override
    public DialFace applyModifier() {
        return new DialFace(Face.MOVE_MOD_TURN);
    }
}
