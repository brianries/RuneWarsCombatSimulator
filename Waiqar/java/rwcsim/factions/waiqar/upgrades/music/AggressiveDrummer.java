package rwcsim.factions.waiqar.upgrades.music;

import rwcsim.base.dials.DialFace;
import rwcsim.base.dials.Face;
import rwcsim.base.systems.stages.OnMarch;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Music;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class AggressiveDrummer extends FigureUpgrade implements Cost, Waiqar, Music, InfantryUpgrade, OnMarch {

    @Override
    public DialFace applyModifier() {
        return new DialFace(Face.MOVE_MOD_CHARGE);
    }

    @Override
    public int price() {
        return 5;
    }
}
