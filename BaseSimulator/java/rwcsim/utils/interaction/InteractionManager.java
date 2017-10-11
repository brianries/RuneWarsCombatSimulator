package rwcsim.utils.interaction;

import rwcsim.base.AttackType;
import rwcsim.base.systems.UnitFormationManager;
import rwcsim.factions.base.DeployableUnit;
import rwcsim.utils.dice.Die;
import rwcsim.utils.dice.DieFace;

import java.util.List;
import java.util.Map;

public interface InteractionManager {
    int[] defineFlankingPool();

    Map<Die,List<DieFace>> reroll(int rerollRankCount, boolean rerollPartialRank, UnitFormationManager attacker, Map<Die, List<DieFace>> results, AttackType type);
    void applyMortalStrikes(UnitFormationManager unit, int count);
    void assignAccuracies(UnitFormationManager unit, int count);
    void applyHits(UnitFormationManager defendingUnit, int hitCount);
    void applyMorale(UnitFormationManager defendingUnit, int moraleCount);

    void applySurges(UnitFormationManager attackingUnit, UnitFormationManager defendingUnit, int surgeCount);
}

