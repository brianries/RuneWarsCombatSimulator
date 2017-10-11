package rwcsim.factions.latari;

import rwcsim.base.Formation;
import rwcsim.base.dials.CommandTool;
import rwcsim.base.dials.DialFace;
import rwcsim.base.dials.Face;
import rwcsim.base.dials.FaceColor;
import rwcsim.factions.base.Infantry;
import rwcsim.factions.base.LatariUnit;
import rwcsim.factions.base.Unit;
import rwcsim.factions.base.upgrades.UpgradeType;
import rwcsim.utils.dice.DiePool;
import rwcsim.utils.trays.InfantryTray;
import rwcsim.utils.trays.Tray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dsayles on 8/18/17.
 */
public class DarnatiWarriors extends LatariUnit implements Infantry {


    public DarnatiWarriors() {
        super();
    }
//    public DarnatiWarriors(Formation formation, int[] unitStats, DiePool diePool){
//        super(formation, unitStats, diePool);
//    }

    @Override
    public void initializeUnit() {
        this.commandTool = new CommandTool();
        List<DialFace> actionFaces = new ArrayList<>();
        List<DialFace> modifierFaces = new ArrayList<>();

        actionFaces.add(new DialFace(3, Face.MARCH, FaceColor.BLUE, 1));
        actionFaces.add(new DialFace(4, Face.MARCH, FaceColor.BLUE, 2));
        actionFaces.add(new DialFace(5, Face.RALLY, FaceColor.BLUE));
        actionFaces.add(new DialFace(6, Face.SHIFT, FaceColor.BLUE, 1));
        actionFaces.add(new DialFace(5, Face.MARCH, FaceColor.GREEN, 2));
        actionFaces.add(new DialFace(6, Face.MARCH, FaceColor.GREEN,3));
        actionFaces.add(new DialFace(4, Face.ATTACK_MELEE, FaceColor.RED));
        actionFaces.add(new DialFace(Face.BLANK));

        modifierFaces.add(new DialFace(Face.MOVE_MOD_CHARGE, FaceColor.BLUE));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_TURNING_CHARGE, FaceColor.BLUE));
        modifierFaces.add(new DialFace(Face.DEFEND, FaceColor.BLUE, 1));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_TURN, FaceColor.GREEN));
        modifierFaces.add(new DialFace(Face.SHIFT, FaceColor.GREEN, 1));
        modifierFaces.add(new DialFace(Face.ENHANCE_HIT, FaceColor.RED, 1));
        modifierFaces.add(new DialFace(Face.SKILL, FaceColor.WHITE));
        modifierFaces.add(new DialFace(Face.REFORM, FaceColor.WHITE));

        commandTool.setActionDialFaces(actionFaces);
        commandTool.setModifierDialFaces(modifierFaces);

        setMeleeAttackPool(new DiePool(0, 0, 0));
        setRangedAttackPool(new DiePool(0,0,0));
    }

    public void populateFormations() {
        if (Unit.legalFormations.size()>0) return;
        Unit.legalFormations.add(Formation.TWO_BY_ONE);
        Unit.legalFormations.add(Formation.TWO_BY_TWO);
        Unit.legalFormations.add(Formation.THREE_BY_TWO);
        Unit.legalFormations.add(Formation.THREE_BY_THREE);
    }


    @Override
    public void populateUpgrades(Formation formation) {
        int legalFormationIndex = Unit.legalFormations.indexOf(formation);
        switch(legalFormationIndex) {
            case 3:
                Unit.legalUpgrades.add(UpgradeType.Heavy);
            case 2:
                Unit.legalUpgrades.add(UpgradeType.Heraldry);
                Unit.legalUpgrades.add(UpgradeType.Music);
            case 1:
                Unit.legalUpgrades.add(UpgradeType.Champion);
            case 0:
                Unit.legalUpgrades.add(UpgradeType.Equipment);
                Unit.legalUpgrades.add(UpgradeType.Training);
                break;
            default:
                return;
        }
    }


    @Override
    public Tray getTray() {
        return new InfantryTray();
    }
}
