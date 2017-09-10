package rwcsim.factions.base;

import rwcsim.base.Formation;
import rwcsim.base.dials.CommandTool;
import rwcsim.utils.dice.DiePool;

public class DeployableUnit {
    private Unit unit;
    private Formation formation;

    private DiePool meleePool;
    private DiePool rangedPool;

    private int unitPrice;

    private CommandTool commandTool;

    public Unit getUnit() { return unit; }
}
