package rwcsim.factions.latari;

import rwcsim.basicutils.Formation;
import rwcsim.basicutils.abilities.Brutal;
import rwcsim.basicutils.abilities.Impact;
import rwcsim.basicutils.abilities.Precise;
import rwcsim.basicutils.concepts.Cavalry;
import rwcsim.basicutils.concepts.Hero;
import rwcsim.basicutils.unit.LatariUnit;
import rwcsim.basicutils.unit.Unit;
import rwcsim.basicutils.dials.CommandTool;
import rwcsim.basicutils.dials.DialFace;
import rwcsim.basicutils.dials.Face;
import rwcsim.basicutils.dials.FaceColor;
import rwcsim.basicutils.upgrade.Unique;
import rwcsim.basicutils.upgrade.UpgradeType;
import rwcsim.basicutils.dice.DiePool;
import rwcsim.basicutils.runes.RuneFaces;
import rwcsim.basicutils.trays.HeroTray;
import rwcsim.basicutils.concepts.Tray;

import java.util.ArrayList;
import java.util.List;

public class AlianaOfSummersong extends LatariUnit implements Hero, Cavalry, Unique {

    public AlianaOfSummersong() {
        super();
    }
//    public AlianaOfSummersong(Formation formation, int[] unitStats, DiePool diePool){
//        super(formation, unitStats, diePool);
//    }

    @Override
    public void initializeUnit() {
        this.commandTool = new CommandTool();
        List<DialFace> actionFaces = new ArrayList<>();
        List<DialFace> modifierFaces = new ArrayList<>();

        actionFaces.add(new DialFace(2, Face.MARCH, FaceColor.BLUE, 2));
        actionFaces.add(new DialFace(3, Face.MARCH, FaceColor.BLUE, 3));
        actionFaces.add(new DialFace(4, Face.MARCH, FaceColor.BLUE, 4));
        actionFaces.add(new DialFace(6, Face.SHIFT, FaceColor.GREEN, 2));
        actionFaces.add(new DialFace(7, Face.MARCH, FaceColor.GREEN, 4));
        actionFaces.add(new DialFace(3, Face.ATTACK_MELEE, FaceColor.RED));
        actionFaces.add(new DialFace(2, Face.SKILL, FaceColor.YELLOW));
        actionFaces.add(new DialFace(Face.BLANK));

        modifierFaces.add(new DialFace(Face.DEFEND, FaceColor.BLUE, 1));
        modifierFaces.add(new DialFace(Face.SHIFT, FaceColor.GREEN, RuneFaces.NATURAL));
        modifierFaces.add(new DialFace(Face.ENHANCE_MORALE, FaceColor.RED, 1));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_TURN, FaceColor.WHITE, -1));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_WHEEL, FaceColor.WHITE, -1));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_CHARGE, FaceColor.WHITE));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_TURNING_CHARGE, FaceColor.WHITE, -1));
        modifierFaces.add(new DialFace(Face.REFORM, FaceColor.WHITE));

        commandTool.setActionDialFaces(actionFaces);
        commandTool.setModifierDialFaces(modifierFaces);

        setMeleeAttackPool(new DiePool(1, 1, 1));
        setRangedAttackPool(new DiePool(0,0,0));
    }

    public void populateFormations() {
        Unit.legalFormations.add(Formation.ONE);
    }


    @Override
    public void populateUpgrades(Formation formation) {
        Unit.legalUpgrades.add(UpgradeType.Artifact);
        Unit.legalUpgrades.add(UpgradeType.Unique);
    }

    @Override
    public Tray getTray() {
        return new HeroTray();
    }

    @Override
    public void setAbilities() {
        addAbility(Impact.asAbility(2));
        addAbility(Precise.asAbility(1));
    }
}
