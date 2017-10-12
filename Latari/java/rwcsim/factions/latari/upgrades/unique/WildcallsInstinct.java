package rwcsim.factions.latari.upgrades.unique;

import rwcsim.basicutils.concepts.Stage;
import rwcsim.basicutils.dials.DialFace;
import rwcsim.basicutils.dials.Face;
import rwcsim.basicutils.modifiers.AddStages;
import rwcsim.basicutils.stages.OnMarch;
import rwcsim.basicutils.stages.OnShift;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.HeroSpecific;
import rwcsim.basicutils.upgrade.Unique;
import rwcsim.factions.latari.AlianaOfSummersong;
import rwcsim.factions.latari.upgrades.Latari;

import java.util.List;

public class WildcallsInstinct implements Cost, Latari, HeroSpecific<AlianaOfSummersong>, Unique, AddStages<OnMarch, OnShift> {

    public DialFace applyModifier() {
        return new DialFace(Face.MOVE_MOD_TURN);
    }

    @Override
    public int price() {
        return 2;
    }

    @Override
    public List<Stage> getStage() {
        return null;
    }
}
