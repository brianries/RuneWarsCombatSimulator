package rwcsim.factions.waiqar;

import rwcsim.base.Formation;
import rwcsim.base.dials.CommandTool;
import rwcsim.base.dials.DialFace;
import rwcsim.base.dials.Face;
import rwcsim.base.dials.FaceColor;
import rwcsim.factions.base.BaseUnit;
import rwcsim.factions.base.Cavalry;
import rwcsim.factions.base.Infantry;
import rwcsim.factions.base.Unit;
import rwcsim.factions.base.upgrades.UpgradeType;
import rwcsim.test.CoreUnit;
import rwcsim.utils.dice.DiePool;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dsayles on 8/18/17.
 */
public class DeathKnights extends WaiqarUnit implements Cavalry {


    public DeathKnights() {
        super();
    }
//    public DeathKnights(Formation formation, int[] unitStats, DiePool diePool){
//        super(formation, unitStats, diePool);
//    }

    @Override
    public void initializeUnit() {
        this.commandTool = new CommandTool();
        List<DialFace> actionFaces = new ArrayList<>();
        List<DialFace> modifierFaces = new ArrayList<>();

        actionFaces.add(new DialFace(3, Face.MARCH, FaceColor.BLUE, 1));
        actionFaces.add(new DialFace(5, Face.MARCH, FaceColor.BLUE, 2));
        actionFaces.add(new DialFace(7, Face.MARCH, FaceColor.BLUE, 3));
        actionFaces.add(new DialFace(9, Face.MARCH, FaceColor.BLUE, 2));
        actionFaces.add(new DialFace(4, Face.REFORM, FaceColor.GREEN));
        actionFaces.add(new DialFace(6, Face.SHIFT, FaceColor.GREEN, 1));
        actionFaces.add(new DialFace(7, Face.RALLY, FaceColor.GREEN));
        actionFaces.add(new DialFace(4, Face.ATTACK_MELEE, FaceColor.RED));

        modifierFaces.add(new DialFace(Face.MOVE_MOD_TURN, FaceColor.BLUE, -1));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_CHARGE, FaceColor.BLUE, 1));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_TURNING_CHARGE, FaceColor.BLUE));
        modifierFaces.add(new DialFace(Face.MARCH, FaceColor.BLUE, 2));
        modifierFaces.add(new DialFace(Face.REFORM, FaceColor.BLUE));
        modifierFaces.add(new DialFace(Face.ENHANCE_MORTAL_STRIKE, FaceColor.RED, 1));
        modifierFaces.add(new DialFace(Face.SKILL, FaceColor.WHITE));
        modifierFaces.add(new DialFace(Face.BLANK));

        commandTool.setActionDialFaces(actionFaces);
        commandTool.setModifierDialFaces(modifierFaces);
        
        setMeleeAttackPool(new DiePool(2, 1, 0));
        setRangedAttackPool(new DiePool(0,0,0));
    }


    public void populateFormations() {
        if (legalFormations.size() > 0) return;
        legalFormations.add(Formation.ONE);
        legalFormations.add(Formation.TWO_BY_ONE);
        legalFormations.add(Formation.TWO_BY_TWO);
        legalFormations.add(Formation.TWO_BY_THREE);

    }


    @Override
    public void populateUpgrades(Formation formation) {}

    @Override
    public void populateUpgrades(boolean listContainsArdus, Formation formation) {
        int legalFormationIndex = legalFormations.indexOf(formation);
        if (listContainsArdus) {
            if (legalFormationIndex < (legalFormations.size() - 1)) {
                legalFormationIndex++;
            }
        }

        switch(legalFormationIndex) {
            case 2:
                legalUpgrades.add(UpgradeType.Heraldry);
            case 1:
                legalUpgrades.add(UpgradeType.Champion);
            case 0:
                legalUpgrades.add(UpgradeType.Artifact);
                legalUpgrades.add(UpgradeType.Training);
                break;
            default:
                return;
        }
    }
}
