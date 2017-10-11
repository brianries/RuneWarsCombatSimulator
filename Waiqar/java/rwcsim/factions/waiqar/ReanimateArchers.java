package rwcsim.factions.waiqar;

import rwcsim.basicutils.Formation;
import rwcsim.basicutils.dials.CommandTool;
import rwcsim.basicutils.dials.DialFace;
import rwcsim.basicutils.dials.Face;
import rwcsim.basicutils.dials.FaceColor;
import rwcsim.basicutils.concepts.Infantry;
import rwcsim.basicutils.unit.Unit;
import rwcsim.basicutils.unit.WaiqarUnit;
import rwcsim.basicutils.upgrade.UpgradeType;
import rwcsim.basicutils.dice.DiePool;
import rwcsim.basicutils.trays.InfantryTray;
import rwcsim.basicutils.concepts.Tray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dsayles on 8/18/17.
 */
public class ReanimateArchers extends WaiqarUnit implements Infantry {


    public ReanimateArchers() {
        super();
    }
//    public ReanimateArchers(Formation formation, int[] unitStats, DiePool diePool){
//        super(formation, unitStats, diePool);
//    }

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

        setMeleeAttackPool(new DiePool(1, 0, 0));
        setRangedAttackPool(new DiePool(1,1,0));
    }

    public void populateFormations() {
        if (Unit.legalFormations.size()>0) return;
        Unit.legalFormations.add(Formation.TWO_BY_TWO);
        Unit.legalFormations.add(Formation.TWO_BY_TWO);
        Unit.legalFormations.add(Formation.THREE_BY_TWO);
    }

    @Override
    public void populateUpgrades(Formation formation) {}

    @Override
    public void populateUpgrades(boolean listContainsArdus, Formation formation) {
        int legalFormationIndex = Unit.legalFormations.indexOf(formation);
        if (listContainsArdus) {
            if (legalFormationIndex < (Unit.legalFormations.size() - 1)) {
                legalFormationIndex++;
            }
        }

        switch(legalFormationIndex) {
            case 2:
                Unit.legalUpgrades.add(UpgradeType.Training);
            case 1:
                Unit.legalUpgrades.add(UpgradeType.Equipment);
            case 0:
                Unit.legalUpgrades.add(UpgradeType.Heraldry);
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
