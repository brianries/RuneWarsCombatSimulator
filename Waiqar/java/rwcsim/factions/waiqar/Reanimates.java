package rwcsim.factions.waiqar;

import org.apache.log4j.Logger;
import rwcsim.basicutils.Formation;
import rwcsim.basicutils.abilities.Regenerate;
import rwcsim.basicutils.abilities.Steadfast;
import rwcsim.basicutils.dials.*;
import rwcsim.basicutils.concepts.Infantry;
import rwcsim.basicutils.morale.MoraleType;
import rwcsim.basicutils.runes.RuneFaces;
import rwcsim.basicutils.concepts.Unit;
import rwcsim.basicutils.unit.WaiqarUnit;
import rwcsim.basicutils.upgrades.UpgradeType;
import rwcsim.basicutils.dice.DiePool;
import rwcsim.basicutils.trays.InfantryTray;
import rwcsim.basicutils.concepts.Tray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dsayles on 8/18/17.
 */
public class Reanimates extends WaiqarUnit implements Infantry {
    private static final Logger logger = Logger.getLogger(Reanimates.class);
    Formation formation;

    public Reanimates() {
        super();
    }
//    public Reanimates(Formation formation, int[] unitStats, DiePool diePool){
//        super(formation, unitStats, diePool);
//    }





    @Override
    public void initializeUnit() {
        logger.info("initializeUnit()");
        this.commandTool = new CommandTool();
        List<DialFace> actionFaces = new ArrayList<>();
        List<DialFace> modifierFaces = new ArrayList<>();

        actionFaces.add(new DialFace(5, Face.MARCH, FaceColor.BLUE, 2));
        actionFaces.add(new DialFace(6, Face.MARCH, FaceColor.BLUE, 3));
        actionFaces.add(new DialFace(4, Face.RALLY, FaceColor.GREEN));
        actionFaces.add(new DialFace(5, Face.REFORM, FaceColor.GREEN));
        actionFaces.add(new DialFace(7, Face.SHIFT, FaceColor.GREEN, 1));
        actionFaces.add(new DialFace(4, Face.ATTACK_MELEE, FaceColor.RED));
        actionFaces.add(new DialFace(Face.BLANK));
        actionFaces.add(new DialFace(Face.BLANK));

        modifierFaces.add(new DialFace(Face.SKILL, FaceColor.WHITE));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_TURN, FaceColor.BLUE, -1));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_WHEEL, FaceColor.BLUE, -2));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_CHARGE, FaceColor.BLUE, -1));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_TURNING_CHARGE, FaceColor.BLUE, -1));
        modifierFaces.add(new DialFace(Face.DEFEND, FaceColor.GREEN, 1));
        modifierFaces.add(new DialFace(Face.ENHANCE_MORALE, FaceColor.RED, 1));
        modifierFaces.add(new DialFace(Face.BLANK));

        commandTool.setActionDialFaces(actionFaces);
        commandTool.setModifierDialFaces(modifierFaces);

        setMeleeAttackPool(new DiePool(2, 0, 0));
        setRangedAttackPool(new DiePool(0,0,0));
    }


    public void populateFormations() {
        if (Unit.legalFormations.size() > 0) return;
        Unit.legalFormations.add(Formation.TWO_BY_ONE);
        Unit.legalFormations.add(Formation.TWO_BY_TWO);
        Unit.legalFormations.add(Formation.THREE_BY_TWO);
        Unit.legalFormations.add(Formation.THREE_BY_THREE);
        Unit.legalFormations.add(Formation.FOUR_BY_THREE);
    }


    @Override
    public void populateUpgrades(Formation formation) {}

    @Override
    public void populateUpgrades(boolean listContainsArdus, Formation formation) {
        int legalFormationIndex = Unit.legalFormations.indexOf(formation);
        if (listContainsArdus) {
            if (legalFormationIndex < (Unit.legalFormations.size()-1)) {
                legalFormationIndex++;
            }
        }

        switch (legalFormationIndex) {
            case 4:
            case 3:
                Unit.legalUpgrades.add(UpgradeType.Heavy);
                Unit.legalUpgrades.add(UpgradeType.Training);
            case 2:
                Unit.legalUpgrades.add(UpgradeType.Champion);
            case 1:
                Unit.legalUpgrades.add(UpgradeType.Heraldry);
            case 0:
                Unit.legalUpgrades.add(UpgradeType.Music);
                break;
            default:
                return;
        }
    }

    @Override
    public Tray getTray() {
        return new InfantryTray();
    }

    @Override
    public void setAbilities() {
        addAbility(Regenerate.asAbility(RuneFaces.NATURAL));
        addAbility(Steadfast.asAbility(MoraleType.DOUBT,1));
    }
}
