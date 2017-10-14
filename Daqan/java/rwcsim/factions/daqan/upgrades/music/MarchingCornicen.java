package rwcsim.factions.daqan.upgrades.music;

import rwcsim.basicutils.concepts.Figure;
import rwcsim.basicutils.dials.DialFace;
import rwcsim.basicutils.dials.Face;
import rwcsim.basicutils.stages.OnMarch;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.concepts.FigureUpgrade;
import rwcsim.basicutils.upgrades.InfantryUpgrade;
import rwcsim.basicutils.upgrades.Music;
import rwcsim.factions.daqan.upgrades.Daqan;

public class MarchingCornicen implements FigureUpgrade, Cost, Daqan, Music, InfantryUpgrade, OnMarch {
    public MarchingCornicen() {

    }

    @Override
    public DialFace applyModifier() {
        return new DialFace(Face.MOVE_MOD_TURN);
    }

    @Override
    public int price() {
        return 2;
    }

    @Override
    public Figure getFigure() {
        return null;
    }

    @Override
    public int getArmor() {
        return 2;
    }
}
