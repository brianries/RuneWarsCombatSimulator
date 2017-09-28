package rwcsim.utils.interaction;

import rwcsim.base.AttackType;
import rwcsim.factions.base.DeployableUnit;
import rwcsim.utils.dice.Die;
import rwcsim.utils.dice.DieFace;

import java.util.List;
import java.util.Map;

public interface InteractionManager {
    int[] defineFlankingPool();

    Map<Die,List<DieFace>> reroll(int rerollRankCount, boolean rerollPartialRank, DeployableUnit attacker, Map<Die, List<DieFace>> results, AttackType type);
}

