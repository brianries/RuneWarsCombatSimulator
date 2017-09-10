package rwcsim.factions.latari;

import rwcsim.base.Formation;
import rwcsim.base.dials.CommandTool;
import rwcsim.base.dials.DialFace;
import rwcsim.base.dials.Face;
import rwcsim.base.dials.FaceColor;
import rwcsim.factions.base.*;
import rwcsim.test.CoreUnit;
import rwcsim.utils.dice.DiePool;
import rwcsim.utils.runes.Rune;

import java.util.ArrayList;
import java.util.List;

public class AlianaOfSummersong extends BaseUnit implements Hero, Cavalry {

    public AlianaOfSummersong() {
        super();
    }
//    public AlianaOfSummersong(Formation formation, int[] unitStats, DiePool diePool){
//        super(formation, unitStats, diePool);
//    }

    @Override
    public void initializeUnit() {
        this.commandTool = new CommandTool();
        List<DialFace> actionFaces = new ArrayList<>();
        List<DialFace> modifierFaces = new ArrayList<>();

        actionFaces.add(new DialFace(2, Face.MARCH, FaceColor.BLUE, 2));
        actionFaces.add(new DialFace(3, Face.MARCH, FaceColor.BLUE, 3));
        actionFaces.add(new DialFace(4, Face.MARCH, FaceColor.BLUE, 4));
        actionFaces.add(new DialFace(6, Face.SHIFT, FaceColor.GREEN, 2));
        actionFaces.add(new DialFace(7, Face.MARCH, FaceColor.GREEN, 4));
        actionFaces.add(new DialFace(3, Face.ATTACK_MELEE, FaceColor.RED));
        actionFaces.add(new DialFace(2, Face.SKILL, FaceColor.YELLOW));
        actionFaces.add(new DialFace(Face.BLANK));

        modifierFaces.add(new DialFace(Face.DEFEND, FaceColor.BLUE, 1));
        modifierFaces.add(new DialFace(Face.SHIFT, FaceColor.GREEN, Rune.NATURAL));
        modifierFaces.add(new DialFace(Face.ENHANCE_MORALE, FaceColor.RED, 1));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_TURN, FaceColor.WHITE, -1));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_WHEEL, FaceColor.WHITE, -1));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_CHARGE, FaceColor.WHITE));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_TURNING_CHARGE, FaceColor.WHITE, -1));
        modifierFaces.add(new DialFace(Face.REFORM, FaceColor.WHITE));

        commandTool.setActionDialFaces(actionFaces);
        commandTool.setModifierDialFaces(modifierFaces);
    }
}
