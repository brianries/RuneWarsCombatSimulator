package rwcsim.factions.latari;

import rwcsim.base.Formation;
import rwcsim.base.dials.CommandTool;
import rwcsim.base.dials.DialFace;
import rwcsim.base.dials.Face;
import rwcsim.base.dials.FaceColor;
import rwcsim.factions.base.BaseUnit;
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
public class DeepwoodArchers extends LatariUnit implements Infantry {


    public DeepwoodArchers() {
        super();
    }
//    public DeepwoodArchers(Formation formation, int[] unitStats, DiePool diePool){
//        super(formation, unitStats, diePool);
//    }

    @Override
    public void initializeUnit() {
        this.commandTool = new CommandTool();
        List<DialFace> actionFaces = new ArrayList<>();
        List<DialFace> modifierFaces = new ArrayList<>();

        actionFaces.add(new DialFace(3, Face.MARCH, FaceColor.BLUE, 1));
        actionFaces.add(new DialFace(5, Face.MARCH, FaceColor.BLUE, 2));
        actionFaces.add(new DialFace(6, Face.SHIFT, FaceColor.BLUE,1));
        actionFaces.add(new DialFace(6, Face.RALLY, FaceColor.GREEN));
        actionFaces.add(new DialFace(7, Face.MARCH, FaceColor.GREEN, 2));
        actionFaces.add(new DialFace(8, Face.SHIFT, FaceColor.GREEN, 1));
        actionFaces.add(new DialFace(5, Face.ATTACK_RANGED, FaceColor.RED));
        actionFaces.add(new DialFace(9 ,Face.ATTACK_MELEE, FaceColor.RED));

        modifierFaces.add(new DialFace(Face.MOVE_MOD_TURN, FaceColor.BLUE));
        modifierFaces.add(new DialFace(Face.REFORM, FaceColor.BLUE));
        modifierFaces.add(new DialFace(Face.SHIFT, FaceColor.GREEN, 1));
        modifierFaces.add(new DialFace(Face.ENHANCE_SURGE, FaceColor.RED, 1));
        modifierFaces.add(new DialFace(Face.SKILL, FaceColor.WHITE));
        modifierFaces.add(new DialFace(Face.BLANK));
        modifierFaces.add(new DialFace(Face.BLANK));
        modifierFaces.add(new DialFace(Face.BLANK));

        commandTool.setActionDialFaces(actionFaces);
        commandTool.setModifierDialFaces(modifierFaces);

        setMeleeAttackPool(new DiePool(0, 1, 0));
        setRangedAttackPool(new DiePool(0,2,0));
    }

    public void populateFormations() {
        if (legalFormations.size()>0) return;
        legalFormations.add(Formation.TWO_BY_ONE);
        legalFormations.add(Formation.TWO_BY_TWO);
        legalFormations.add(Formation.TWO_BY_TWO_2);
        legalFormations.add(Formation.THREE_BY_TWO);
    }


    @Override
    public void populateUpgrades(Formation formation) {
        int legalFormationIndex = legalFormations.indexOf(formation);
        switch(legalFormationIndex) {
            case 3:
                legalUpgrades.add(UpgradeType.Heavy);
            case 2:
                legalUpgrades.add(UpgradeType.Champion);
                legalUpgrades.add(UpgradeType.Music);
            case 0:
                legalUpgrades.add(UpgradeType.Equipment);
                legalUpgrades.add(UpgradeType.Training);
                break;
            case 1:
                legalUpgrades.add(UpgradeType.Equipment);
                legalUpgrades.add(UpgradeType.Heraldry);
                legalUpgrades.add(UpgradeType.Music);
                legalUpgrades.add(UpgradeType.Training);
                break;
            default:
                return;
        }
    }
}
