package rwcsim.factions.latari;

import rwcsim.base.Formation;
import rwcsim.base.dials.CommandTool;
import rwcsim.base.dials.DialFace;
import rwcsim.base.dials.Face;
import rwcsim.base.dials.FaceColor;
import rwcsim.factions.base.BaseUnit;
import rwcsim.factions.base.Cavalry;
import rwcsim.factions.base.Unit;
import rwcsim.factions.base.upgrades.UpgradeType;
import rwcsim.test.CoreUnit;
import rwcsim.utils.dice.DiePool;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dsayles on 8/18/17.
 */
public class LeonxRiders extends LatariUnit implements Cavalry {


    public LeonxRiders() {
        super();
    }
//    public LeonxRiders(Formation formation, int[] unitStats, DiePool diePool){
//        super(formation, unitStats, diePool);
//    }

    @Override
    public void initializeUnit() {
        this.commandTool = new CommandTool();
        List<DialFace> actionFaces = new ArrayList<>();
        List<DialFace> modifierFaces = new ArrayList<>();

        actionFaces.add(new DialFace(3, Face.MARCH, FaceColor.BLUE, 1));
        actionFaces.add(new DialFace(4, Face.MARCH, FaceColor.BLUE, 2));
        actionFaces.add(new DialFace(6, Face.SHIFT, FaceColor.BLUE, 1));
        actionFaces.add(new DialFace(7, Face.MARCH, FaceColor.BLUE, 4));
        actionFaces.add(new DialFace(8, Face.RALLY, FaceColor.BLUE));
        actionFaces.add(new DialFace(4, Face.ATTACK_MELEE, FaceColor.RED));
        actionFaces.add(new DialFace(3, Face.SKILL, FaceColor.YELLOW));
        actionFaces.add(new DialFace(Face.BLANK));

        modifierFaces.add(new DialFace(Face.MOVE_MOD_TURN, FaceColor.BLUE));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_CHARGE, FaceColor.BLUE, 1));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_TURNING_CHARGE, FaceColor.BLUE));
        modifierFaces.add(new DialFace(Face.SHIFT, FaceColor.BLUE, 1));
        modifierFaces.add(new DialFace(Face.MARCH, FaceColor.BLUE, 2));
        modifierFaces.add(new DialFace(Face.ENHANCE_MORALE, FaceColor.RED, 1));
        modifierFaces.add(new DialFace(Face.REFORM, FaceColor.WHITE));
        modifierFaces.add(new DialFace(Face.BLANK));

        commandTool.setActionDialFaces(actionFaces);
        commandTool.setModifierDialFaces(modifierFaces);

        setMeleeAttackPool(new DiePool(1, 2, 0));
        setRangedAttackPool(new DiePool(0,0,0));
    }


    public void populateFormations() {
        if (legalFormations.size()>0) return;
        legalFormations.add(Formation.TWO_BY_ONE);
        legalFormations.add(Formation.THREE_BY_ONE);
        legalFormations.add(Formation.TWO_BY_TWO);
        legalFormations.add(Formation.THREE_BY_TWO);
    }


    @Override
    public void populateUpgrades(Formation formation) {
        int legalFormationIndex = legalFormations.indexOf(formation);
        switch(legalFormationIndex) {
            case 3:
            case 2:
                legalUpgrades.add(UpgradeType.Champion);
                legalUpgrades.add(UpgradeType.Heraldry);
            case 1:
            case 0:
                legalUpgrades.add(UpgradeType.Music);
                legalUpgrades.add(UpgradeType.Training);
                break;
            default:
                return;
        }
    }
}
