package rwcsim.factions.neutral.upgrades.training;

import rwcsim.base.systems.actions.AddDie;
import rwcsim.base.systems.stages.Exhaustable;
import rwcsim.base.systems.stages.OnAttack;
import rwcsim.factions.base.upgrades.Training;

public class MomentOfInspiration implements Training, Exhaustable, AddDie, OnAttack {
    @Override
    public int[] modifyDiePool() {
        return new int[]{0,0,1};
    }
}
