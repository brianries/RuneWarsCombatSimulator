package rwcsim.factions.waiqar.upgrades.music;

import rwcsim.basicutils.dials.DialFace;
import rwcsim.basicutils.dials.Face;
import rwcsim.basicutils.stages.OnMarch;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.InfantryUpgrade;
import rwcsim.basicutils.upgrade.Music;
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
