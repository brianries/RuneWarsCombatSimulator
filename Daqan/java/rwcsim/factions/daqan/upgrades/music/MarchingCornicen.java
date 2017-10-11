package rwcsim.factions.daqan.upgrades.music;

import rwcsim.base.dials.DialFace;
import rwcsim.base.dials.Face;
import rwcsim.base.systems.stages.OnMarch;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Music;
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
