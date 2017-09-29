package rwcsim.utils.interaction.ai;

import rwcsim.base.AttackType;
import rwcsim.factions.base.DeployableUnit;
import rwcsim.utils.dice.Die;
import rwcsim.utils.dice.DieFace;
import rwcsim.utils.interaction.BaseInteractionManager;

import java.util.List;
import java.util.Map;

public class AIInteractionManager extends BaseInteractionManager {
    @Override
    public int[] defineFlankingPool() {
        return new int[0];
    }

    @Override
    public Map<Die, List<DieFace>> reroll(int rerollRankCount, boolean rerollPartialRank, DeployableUnit attacker, Map<Die, List<DieFace>> results, AttackType type) {
        return null;
    }
}
