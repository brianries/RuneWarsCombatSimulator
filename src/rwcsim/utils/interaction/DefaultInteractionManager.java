package rwcsim.utils.interaction;

import rwcsim.factions.base.DeployableUnit;
import rwcsim.utils.dice.Die;
import rwcsim.utils.dice.DieFace;

import java.util.List;
import java.util.Map;

public class DefaultInteractionManager extends BaseInteractionManager {
    private static DefaultInteractionManager dim = new DefaultInteractionManager();

    public static InteractionManager instance() {
        return dim;
    }

    @Override
    public int[] defineFlankingPool() {
        return new int[]{0,1,0};
    }

    @Override
    public Map<Die, List<DieFace>> reroll(DeployableUnit attacker, int[] adjustedPool, Map<Die, List<DieFace>> results) {
        /* default reroll of blanks if possible */
        return null;
    }
}
