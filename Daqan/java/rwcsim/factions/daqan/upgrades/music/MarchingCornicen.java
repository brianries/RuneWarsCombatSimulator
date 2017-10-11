package rwcsim.factions.daqan.upgrades.music;

import rwcsim.basicutils.dials.DialFace;
import rwcsim.basicutils.dials.Face;
import rwcsim.basicutils.stages.OnMarch;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.InfantryUpgrade;
import rwcsim.basicutils.upgrade.Music;
import rwcsim.factions.daqan.upgrades.Daqan;

public class MarchingCornicen extends FigureUpgrade implements Cost, Daqan, Music, InfantryUpgrade, OnMarch {
    public MarchingCornicen() {
        this.armor = 2;
    }

    @Override
    public DialFace applyModifier() {
        return new DialFace(Face.MOVE_MOD_TURN);
    }

    @Override
    public int price() {
        return 2;
    }
}
