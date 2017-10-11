package rwcsim.factions.waiqar;

import rwcsim.base.Formation;
import rwcsim.base.dials.CommandTool;
import rwcsim.base.dials.DialFace;
import rwcsim.base.dials.Face;
import rwcsim.base.dials.FaceColor;
import rwcsim.factions.base.*;
import rwcsim.factions.base.upgrades.Unique;
import rwcsim.factions.base.upgrades.UpgradeType;
import rwcsim.utils.dice.DiePool;
import rwcsim.utils.trays.HeroTray;
import rwcsim.utils.trays.Tray;

import java.util.ArrayList;
import java.util.List;

public class ArdusIxErebus extends WaiqarUnit implements Hero, Infantry, Unique {

    public ArdusIxErebus() {
        super();
    }
//    public ArdusIxErebus(Formation formation, int[] unitStats, DiePool diePool){
//        super(formation, unitStats, diePool);
//    }

    @Override
    public void initializeUnit() {
        this.commandTool = new CommandTool();
        List<DialFace> actionFaces = new ArrayList<>();
        List<DialFace> modifierFaces = new ArrayList<>();

        actionFaces.add(new DialFace(4, Face.MARCH, FaceColor.BLUE, 2));
        actionFaces.add(new DialFace(5, Face.MARCH, FaceColor.BLUE, 3));
        actionFaces.add(new DialFace(3, Face.REFORM, FaceColor.GREEN));
        actionFaces.add(new DialFace(5, Face.SHIFT, FaceColor.GREEN, 1));
        actionFaces.add(new DialFace(3, Face.ATTACK_MELEE, FaceColor.RED));
        actionFaces.add(new DialFace(2, Face.SKILL, FaceColor.YELLOW));
        actionFaces.add(new DialFace(Face.BLANK));
        actionFaces.add(new DialFace(Face.BLANK));

        modifierFaces.add(new DialFace(Face.MOVE_MOD_TURN, FaceColor.BLUE, 0));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_WHEEL, FaceColor.BLUE, -1));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_CHARGE, FaceColor.BLUE));
        modifierFaces.add(new DialFace(Face.MOVE_MOD_TURNING_CHARGE, FaceColor.BLUE, -1));
        modifierFaces.add(new DialFace(Face.ENHANCE_HIT, FaceColor.RED, 1));
        modifierFaces.add(new DialFace(Face.ENHANCE_SURGE, FaceColor.RED, 1));
        modifierFaces.add(new DialFace(Face.DEFEND, FaceColor.WHITE, 1));
        modifierFaces.add(new DialFace(Face.RALLY, FaceColor.WHITE));

        commandTool.setActionDialFaces(actionFaces);
        commandTool.setModifierDialFaces(modifierFaces);

        setMeleeAttackPool(new DiePool(0, 0, 2));
        setRangedAttackPool(new DiePool(0,0,0));
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
