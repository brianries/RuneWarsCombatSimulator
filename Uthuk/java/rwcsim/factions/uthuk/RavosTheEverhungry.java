package rwcsim.factions.uthuk;

import rwcsim.base.Formation;
import rwcsim.base.dials.CommandTool;
import rwcsim.base.dials.DialFace;
import rwcsim.base.dials.Face;
import rwcsim.base.dials.FaceColor;
import rwcsim.factions.base.*;
import rwcsim.factions.base.upgrades.Unique;
import rwcsim.factions.base.upgrades.UpgradeType;
import rwcsim.utils.dice.DiePool;
import rwcsim.utils.runes.Rune;
import rwcsim.utils.trays.HeroTray;
import rwcsim.utils.trays.Tray;

import java.util.ArrayList;
import java.util.List;

public class RavosTheEverhungry extends UthukUnit implements Hero, Siege, Unique {

    public RavosTheEverhungry() {
        super();
    }
//    public RavosTheEverhungry(Formation formation, int[] unitStats, DiePool diePool){
//        super(formation, unitStats, diePool);
//    }

    @Override
    public void initializeUnit() {
        this.commandTool = new CommandTool();
        List<DialFace> actionFaces = new ArrayList<>();
        List<DialFace> modifierFaces = new ArrayList<>();

        actionFaces.add(new DialFace(3, Face.MARCH, FaceColor.BLUE, 1));
        actionFaces.add(new DialFace(4, Face.MARCH, FaceColor.BLUE, Rune.UNSTABLE));
        actionFaces.add(new DialFace(6, Face.MARCH, FaceColor.BLUE, 3));
        actionFaces.add(new DialFace(8, Face.MARCH, FaceColor.BLUE, 4));
        actionFaces.add(new DialFace(2, Face.RALLY, FaceColor.GREEN));
        actionFaces.add(new DialFace(7, Face.SHIFT, FaceColor.GREEN, 2));
        actionFaces.add(new DialFace(3, Face.ATTACK_MELEE, FaceColor.RED));
        actionFaces.add(new DialFace(6, Face.ATTACK_MELEE, FaceColor.RED));

        modifierFaces.add(new DialFace(Face.MOVE_MOD_CHARGE, FaceColor.BLUE));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_TURNING_CHARGE, FaceColor.BLUE));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_WHEEL, FaceColor.BLUE, -1));
        modifierFaces.add(new DialFace(Face.REFORM, FaceColor.GREEN));
        modifierFaces.add(new DialFace(Face.DEFEND, FaceColor.GREEN));
        modifierFaces.add(new DialFace(Face.ENHANCE_HIT, FaceColor.RED, 1));
        modifierFaces.add(new DialFace(Face.ENHANCE_MORALE, FaceColor.RED, 2));
        modifierFaces.add(new DialFace(Face.SKILL, FaceColor.WHITE));

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
}
