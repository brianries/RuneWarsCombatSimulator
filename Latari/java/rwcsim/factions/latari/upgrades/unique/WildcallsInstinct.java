package rwcsim.factions.latari.upgrades.unique;

import rwcsim.basicutils.dials.DialFace;
import rwcsim.basicutils.dials.Face;
import rwcsim.basicutils.stages.OnMarch;
import rwcsim.basicutils.stages.OnShift;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.HeroSpecific;
import rwcsim.basicutils.upgrade.Unique;
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
