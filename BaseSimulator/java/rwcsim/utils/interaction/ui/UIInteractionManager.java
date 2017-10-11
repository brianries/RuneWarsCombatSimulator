package rwcsim.utils.interaction.ui;

import rwcsim.base.AttackType;
import rwcsim.base.systems.UnitFormationManager;
import rwcsim.factions.base.DeployableUnit;
import rwcsim.utils.dice.Die;
import rwcsim.utils.dice.DieFace;
import rwcsim.utils.interaction.BaseInteractionManager;

import java.util.List;
import java.util.Map;

public class UIInteractionManager extends BaseInteractionManager {
    @Override
    public int[] defineFlankingPool() {
        return new int[0];
    }

    @Override
    public Map<Die, List<DieFace>> reroll(int rerollRankCount, boolean rerollPartialRank, UnitFormationManager attacker, Map<Die, List<DieFace>> results, AttackType type) {
        return null;
    }

    @Override
    public void applyMortalStrikes(UnitFormationManager unit, int count) {

    }

    @Override
    public void assignAccuracies(UnitFormationManager unit, int count) {

    }

    @Override
    public void applyHits(UnitFormationManager defendingUnit, int hitCount) {

    }

    @Override
    public void applyMorale(UnitFormationManager defendingUnit, int moraleCount) {

    }

    @Override
    public void applySurges(UnitFormationManager attackingUnit, UnitFormationManager defendingUnit, int surgeCount) {

    }
}
