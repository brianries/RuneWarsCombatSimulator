package rwcsim.utils.interaction;

import rwcsim.factions.base.DeployableUnit;
import rwcsim.utils.dice.Die;
import rwcsim.utils.dice.DieFace;

import java.util.List;
import java.util.Map;

public interface InteractionManager {
    int[] defineFlankingPool();

    Map<Die,List<DieFace>> reroll(DeployableUnit attacker, int[] adjustedPool, Map<Die, List<DieFace>> results);
}

