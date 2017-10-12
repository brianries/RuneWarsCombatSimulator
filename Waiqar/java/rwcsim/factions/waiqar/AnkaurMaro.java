package rwcsim.factions.waiqar;

import rwcsim.basicutils.Formation;
import rwcsim.basicutils.concepts.Cavalry;
import rwcsim.basicutils.concepts.Hero;
import rwcsim.basicutils.concepts.Infantry;
import rwcsim.basicutils.unit.Unit;
import rwcsim.basicutils.unit.WaiqarUnit;
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

public class AnkaurMaro extends WaiqarUnit implements Hero, Cavalry, Infantry, Unique {

    public AnkaurMaro() {
        super();
    }
//    public AnkaurMaro(Formation formation, int[] unitStats, DiePool diePool){
//        super(formation, unitStats, diePool);
//    }

    @Override
    public void initializeUnit() {
        this.commandTool = new CommandTool();
        List<DialFace> actionFaces = new ArrayList<>();
        List<DialFace> modifierFaces = new ArrayList<>();

        actionFaces.add(new DialFace(5, Face.MARCH, FaceColor.BLUE, 2));
        actionFaces.add(new DialFace(6, Face.MARCH, FaceColor.BLUE, 3));
        actionFaces.add(new DialFace(7, Face.MARCH, FaceColor.BLUE, 4));
        actionFaces.add(new DialFace(3, Face.REFORM, FaceColor.GREEN));
        actionFaces.add(new DialFace(6, Face.SHIFT, FaceColor.GREEN, 1));
        actionFaces.add(new DialFace(4, Face.ATTACK_MELEE, FaceColor.RED));
        actionFaces.add(new DialFace(6, Face.ATTACK_RANGED, FaceColor.RED));
        actionFaces.add(new DialFace(8, Face.SKILL, FaceColor.YELLOW));

        modifierFaces.add(new DialFace(Face.MOVE_MOD_TURN, FaceColor.BLUE, -2));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_CHARGE, FaceColor.BLUE));
        modifierFaces.add(new DialFace(Face.MARCH, FaceColor.BLUE, 2));
        modifierFaces.add(new DialFace(Face.ENHANCE_HIT, FaceColor.RED, 2));
        modifierFaces.add(new DialFace(Face.ENHANCE_SURGE, FaceColor.RED, 1));
        modifierFaces.add(new DialFace(Face.ENHANCE_MORTAL_STRIKE, FaceColor.RED, 1));
        modifierFaces.add(new DialFace(Face.RALLY, FaceColor.WHITE));
        modifierFaces.add(new DialFace(Face.BLANK));

        commandTool.setActionDialFaces(actionFaces);
        commandTool.setModifierDialFaces(modifierFaces);

        setMeleeAttackPool(new DiePool(0, 0, 1));
        setRangedAttackPool(new DiePool(0,null,0,null,0, RuneFaces.UNSTABLE));
    }

    public void populateFormations() {
        if (Unit.legalFormations.size()>0) return;
        Unit.legalFormations.add(Formation.ONE);
    }


    @Override
    public void populateUpgrades(Formation formation) {}

    @Override
    public void populateUpgrades(boolean listContainsArdus, Formation formation) {
        Unit.legalUpgrades.add(UpgradeType.Artifact);
        Unit.legalUpgrades.add(UpgradeType.Unique);
    }

    @Override
    public Tray getTray() {
        return new HeroTray();
    }
}
