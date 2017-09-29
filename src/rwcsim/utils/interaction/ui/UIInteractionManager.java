package rwcsim.utils.interaction.ui;

import rwcsim.base.AttackType;
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
    public Map<Die, List<DieFace>> reroll(int rerollRankCount, boolean rerollPartialRank, DeployableUnit attacker, Map<Die, List<DieFace>> results, AttackType type) {
        return null;
    }

    @Override
    public void applyMortalStrikes(DeployableUnit unit, int count) {

    }

    @Override
    public void assignAccuracies(DeployableUnit unit, int count) {

    }

    @Override
    public void applyHits(DeployableUnit defendingUnit, int hitCount) {

    }

    @Override
    public void applyMorale(DeployableUnit defendingUnit, int moraleCount) {

    }

    @Override
    public void applySurges(DeployableUnit attackingUnit, DeployableUnit defendingUnit, int surgeCount) {

    }
}
