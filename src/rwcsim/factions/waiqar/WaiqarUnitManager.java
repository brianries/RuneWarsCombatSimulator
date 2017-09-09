package rwcsim.factions.waiqar;

import rwcsim.base.dials.CommandTool;
import rwcsim.base.dials.DialFace;
import rwcsim.base.dials.Face;
import rwcsim.base.dials.FaceColor;
import rwcsim.factions.UnitManager;

import java.util.ArrayList;
import java.util.List;

public class WaiqarUnitManager extends UnitManager {
    public static final int ARDUS_IX_EREBUS = 0;
    public static final int CARRION_LANCERS = 1;
    public static final int REANIMATE_ARCHERS = 2;
    public static final int REANIMATES = 3;
    public static final int ANKAUR_MARO = 4;
    public static final int DEATH_KNIGHTS = 5;
    public static final int WRAITHS = 6;


//    public static CommandTool buildCommandTool(int unitType) {
//        switch (unitType) {
//            case ARDUS_IX_EREBUS:
//                return ardusIxErebus();
//            case CARRION_LANCERS:
//                return carrionLancers();
//            case REANIMATE_ARCHERS:
//                return reanimateArchers();
//            case REANIMATES:
//                return reanimates();
//            case ANKAUR_MARO:
//                return ankaurMaro();
//            case DEATH_KNIGHTS:
//                return deathKnights();
//            case WRAITHS:
//                return wraiths();
//            default:
//                return null;
//        }
//    }

//    private static CommandTool ardusIxErebus() {
//        CommandTool ct = new CommandTool();
//        List<DialFace> actionFaces = new ArrayList<>();
//        List<DialFace> modifierFaces = new ArrayList<>();
//
//        actionFaces.add(new DialFace(4, Face.MARCH, FaceColor.BLUE, 2));
//        actionFaces.add(new DialFace(5, Face.MARCH, FaceColor.BLUE, 3));
//        actionFaces.add(new DialFace(3, Face.REFORM, FaceColor.GREEN));
//        actionFaces.add(new DialFace(5, Face.SHIFT, FaceColor.GREEN, 1));
//        actionFaces.add(new DialFace(3, Face.ATTACK_MELEE, FaceColor.RED));
//        actionFaces.add(new DialFace(2, Face.SKILL, FaceColor.YELLOW));
//        actionFaces.add(new DialFace(Face.BLANK));
//        actionFaces.add(new DialFace(Face.BLANK));
//
//        modifierFaces.add(new DialFace(Face.MOVE_MOD_TURN, FaceColor.BLUE, 0));
//        modifierFaces.add(new DialFace(Face.MOVE_MOD_WHEEL, FaceColor.BLUE, -1));
//        modifierFaces.add(new DialFace(Face.MOVE_MOD_CHARGE, FaceColor.BLUE));
//        modifierFaces.add(new DialFace(Face.MOVE_MOD_TURNING_CHARGE, FaceColor.BLUE, -1));
//        modifierFaces.add(new DialFace(Face.ENHANCE_HIT, FaceColor.RED));
//        modifierFaces.add(new DialFace(Face.ENHANCE_SURGE, FaceColor.RED));
//        modifierFaces.add(new DialFace(Face.DEFEND, FaceColor.WHITE, 1));
//        modifierFaces.add(new DialFace(Face.RALLY, FaceColor.WHITE));
//
//        ct.setActionDialFaces(actionFaces);
//        ct.setModifierDialFaces(modifierFaces);
//
//        return ct;
//    }



}
