package rwcsim.factions.daqan;

import rwcsim.base.Formation;
import rwcsim.base.dials.CommandTool;
import rwcsim.base.dials.DialFace;
import rwcsim.base.dials.Face;
import rwcsim.base.dials.FaceColor;
import rwcsim.factions.base.DaqanUnit;
import rwcsim.factions.base.Infantry;
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
public class HeavyCrossbowmen extends DaqanUnit implements Infantry {


    public HeavyCrossbowmen() {
        super();
    }
//    public HeavyCrossbowmen(Formation formation, int[] unitStats, DiePool diePool){
//        super(formation, unitStats, diePool);
//    }

    @Override
    public void initializeUnit() {
        this.commandTool = new CommandTool();
        List<DialFace> actionFaces = new ArrayList<>();
        List<DialFace> modifierFaces = new ArrayList<>();

        actionFaces.add(new DialFace(5, Face.MARCH, FaceColor.BLUE, 1));
        actionFaces.add(new DialFace(6, Face.MARCH, FaceColor.BLUE, 2));
        actionFaces.add(new DialFace(3, Face.REFORM, FaceColor.GREEN));
        actionFaces.add(new DialFace(4, Face.RALLY, FaceColor.GREEN));
        actionFaces.add(new DialFace(6, Face.SHIFT, FaceColor.GREEN, 1));
        actionFaces.add(new DialFace(4, Face.ATTACK_MELEE, FaceColor.RED));
        actionFaces.add(new DialFace(5, Face.ATTACK_RANGED, FaceColor.YELLOW));
        actionFaces.add(new DialFace(Face.BLANK));

        modifierFaces.add(new DialFace(Face.MOVE_MOD_TURN, FaceColor.BLUE));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_WHEEL, FaceColor.BLUE, -1));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_CHARGE, FaceColor.BLUE));
        modifierFaces.add(new DialFace(Face.ENHANCE_HIT, FaceColor.RED, 1));
        modifierFaces.add(new DialFace(Face.ENHANCE_SURGE, FaceColor.YELLOW, 1));
        modifierFaces.add(new DialFace(Face.MARCH, FaceColor.WHITE, 1));
        modifierFaces.add(new DialFace(Face.SKILL, FaceColor.WHITE));
        modifierFaces.add(new DialFace(Face.BLANK));

        commandTool.setActionDialFaces(actionFaces);
        commandTool.setModifierDialFaces(modifierFaces);

        setMeleeAttackPool(new DiePool(0, 1, 0));
        setRangedAttackPool(new DiePool(1,1,0));
    }

    public void populateFormations() {
        if (Unit.legalFormations.size()>0) return;
        Unit.legalFormations.add(Formation.TWO_BY_ONE);
        Unit.legalFormations.add(Formation.THREE_BY_ONE);
        Unit.legalFormations.add(Formation.THREE_BY_TWO);
    }


    @Override
    public void populateUpgrades(Formation formation) {
        int legalFormationIndex = Unit.legalFormations.indexOf(formation);
        switch(legalFormationIndex) {
            case 2:
                Unit.legalUpgrades.add(UpgradeType.Champion);
            case 1:
                Unit.legalUpgrades.add(UpgradeType.Equipment);
                Unit.legalUpgrades.add(UpgradeType.Music);
            case 0:
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
