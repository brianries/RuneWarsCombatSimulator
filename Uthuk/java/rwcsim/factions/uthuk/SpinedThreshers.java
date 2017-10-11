package rwcsim.factions.uthuk;

import rwcsim.base.Formation;
import rwcsim.base.dials.CommandTool;
import rwcsim.base.dials.DialFace;
import rwcsim.base.dials.Face;
import rwcsim.base.dials.FaceColor;
import rwcsim.factions.base.Siege;
import rwcsim.factions.base.Unit;
import rwcsim.factions.base.UthukUnit;
import rwcsim.factions.base.upgrades.UpgradeType;
import rwcsim.utils.dice.DiePool;
import rwcsim.utils.runes.Rune;
import rwcsim.utils.trays.SiegeTray;
import rwcsim.utils.trays.Tray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dsayles on 8/18/17.
 */
public class SpinedThreshers extends UthukUnit implements Siege {


    public SpinedThreshers() {
        super();
    }
//    public SpinedThreshers(Formation formation, int[] unitStats, DiePool diePool){
//        super(formation, unitStats, diePool);
//    }

    @Override
    public void initializeUnit() {
        this.commandTool = new CommandTool();
        List<DialFace> actionFaces = new ArrayList<>();
        List<DialFace> modifierFaces = new ArrayList<>();

        actionFaces.add(new DialFace(4, Face.MARCH, FaceColor.BLUE, Rune.UNSTABLE));
        actionFaces.add(new DialFace(8, Face.MARCH, FaceColor.BLUE, 2));
        actionFaces.add(new DialFace(7, Face.SHIFT, FaceColor.GREEN, 1));
        actionFaces.add(new DialFace(3, Face.SKILL, FaceColor.RED));
        actionFaces.add(new DialFace(5, Face.ATTACK_MELEE, FaceColor.RED));
        actionFaces.add(new DialFace(Face.BLANK));
        actionFaces.add(new DialFace(Face.BLANK));
        actionFaces.add(new DialFace(Face.BLANK));

        modifierFaces.add(new DialFace(Face.MOVE_MOD_CHARGE, FaceColor.BLUE));
        modifierFaces.add(new DialFace(Face.DEFEND, FaceColor.RED, Rune.STABLE));
        modifierFaces.add(new DialFace(Face.RALLY, FaceColor.WHITE));
        modifierFaces.add(new DialFace(Face.REFORM, FaceColor.WHITE));
        modifierFaces.add(new DialFace(Face.BLANK));
        modifierFaces.add(new DialFace(Face.BLANK));
        modifierFaces.add(new DialFace(Face.BLANK));
        modifierFaces.add(new DialFace(Face.BLANK));

        commandTool.setActionDialFaces(actionFaces);
        commandTool.setModifierDialFaces(modifierFaces);

        setMeleeAttackPool(new DiePool(2, 0, 0));
        setRangedAttackPool(new DiePool(0,0,0));
    }
    public void populateFormations() {
        if (Unit.legalFormations.size()>0) return;
        Unit.legalFormations.add(Formation.ONE);
        Unit.legalFormations.add(Formation.TWO_BY_ONE);
        Unit.legalFormations.add(Formation.TWO_BY_TWO);
        Unit.legalFormations.add(Formation.THREE_BY_TWO);
    }


    @Override
    public void populateUpgrades(Formation formation) {
        int legalFormationIndex = Unit.legalFormations.indexOf(formation);
        switch(legalFormationIndex) {
            case 3:
                Unit.legalUpgrades.add(UpgradeType.Equipment);
            case 2:
                Unit.legalUpgrades.add(UpgradeType.Champion);
            case 1:
                Unit.legalUpgrades.add(UpgradeType.Artifact);
            case 0:
                break;
            default:
                return;
        }
    }

    @Override
    public Tray getTray() {
        return new SiegeTray();
    }
}
