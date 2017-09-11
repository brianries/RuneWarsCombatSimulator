package rwcsim.factions.base;

import rwcsim.base.AttackType;
import rwcsim.base.Formation;
import rwcsim.base.dials.CommandTool;
import rwcsim.base.systems.UnitFormationManager;

import rwcsim.base.systems.UnitStateManager;
import rwcsim.utils.dice.DiePool;

public class DeployableUnit {
    private Unit unit;
    private Formation formation;

    private int unitPrice;

    private CommandTool commandTool;

    public UnitFormationManager unitFormationManager;
    public UnitStateManager unitStateManager;

    public DeployableUnit(Unit unit, Formation formation) {
        this.unit = unit;
        this.formation = formation;
        this.commandTool = unit.getCommandTool();
        this.unitFormationManager = new UnitFormationManager(this);
        this.unitStateManager = new UnitStateManager();
    }

    public Unit getUnit() { return unit; }

    public Formation getFormation() {
        return formation;
    }

    public DiePool getDiePool(AttackType type) {
        switch (type) {
            case MELEE_ATTACK:
                return getUnit().getMeleeAttackPool();
            case RANGED_ATTACK:
                return getUnit().getRangedAttackPool();
        }
        return null;
    }

    public boolean canReroll() {
        return false;
    }
}
