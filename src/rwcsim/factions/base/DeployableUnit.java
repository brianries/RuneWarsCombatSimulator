package rwcsim.factions.base;

import rwcsim.base.Formation;
import rwcsim.base.dials.CommandTool;
import rwcsim.base.systems.UnitFormationManager;
import rwcsim.utils.dice.DiePool;

public class DeployableUnit {
    private Unit unit;
    private Formation formation;

    private DiePool meleePool;
    private DiePool rangedPool;

    private int unitPrice;

    private CommandTool commandTool;

    private UnitFormationManager unitFormationManager;

    public DeployableUnit(Unit unit, Formation formation) {
        this.unit = unit;
        this.formation = formation;
        this.commandTool = unit.getCommandTool();
        this.unitFormationManager = new UnitFormationManager(unit, formation);
    }

    public Unit getUnit() { return unit; }


}
