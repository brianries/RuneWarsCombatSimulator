package rwcsim.factions.waiqar;

import rwcsim.base.Formation;
import rwcsim.base.dials.CommandTool;
import rwcsim.base.dials.DialFace;
import rwcsim.base.dials.Face;
import rwcsim.base.dials.FaceColor;
import rwcsim.factions.base.Infantry;
import rwcsim.factions.base.Unit;
import rwcsim.test.CoreUnit;
import rwcsim.utils.dice.DiePool;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dsayles on 8/18/17.
 */
public class ReanimateArchers extends CoreUnit implements Unit, Infantry {


    public ReanimateArchers() {
        super();
    }
    public ReanimateArchers(Formation formation, int[] unitStats, DiePool diePool){
        super(formation, unitStats, diePool);
    }

    @Override
    public void initializeUnit() {
        this.commandTool = new CommandTool();
        List<DialFace> actionFaces = new ArrayList<>();
        List<DialFace> modifierFaces = new ArrayList<>();

        actionFaces.add(new DialFace(6, Face.MARCH, FaceColor.BLUE, 2));
        actionFaces.add(new DialFace(7, Face.MARCH, FaceColor.BLUE, 3));
        actionFaces.add(new DialFace(2, Face.REFORM, FaceColor.GREEN));
        actionFaces.add(new DialFace(6, Face.SHIFT, FaceColor.GREEN, 1));
        actionFaces.add(new DialFace(7, Face.SHIFT, FaceColor.GREEN, 2));
        actionFaces.add(new DialFace(5, Face.ATTACK_RANGED, FaceColor.RED));
        actionFaces.add(new DialFace(9, Face.ATTACK_MELEE, FaceColor.RED));
        actionFaces.add(new DialFace(Face.BLANK));

        modifierFaces.add(new DialFace(Face.MOVE_MOD_TURN, FaceColor.BLUE, -1));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_WHEEL, FaceColor.BLUE, -1));
        modifierFaces.add(new DialFace(Face.RALLY, FaceColor.GREEN));
        modifierFaces.add(new DialFace(Face.ENHANCE_SURGE, FaceColor.RED, 1));
        modifierFaces.add(new DialFace(Face.SKILL, FaceColor.WHITE));
        modifierFaces.add(new DialFace(Face.BLANK));
        modifierFaces.add(new DialFace(Face.BLANK));
        modifierFaces.add(new DialFace(Face.BLANK));

        commandTool.setActionDialFaces(actionFaces);
        commandTool.setModifierDialFaces(modifierFaces);
    }

}
