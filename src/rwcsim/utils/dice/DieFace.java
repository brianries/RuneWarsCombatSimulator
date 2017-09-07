package rwcsim.utils.dice;

import rwcsim.base.ActionType;

import java.util.*;

/**
 * Created by dsayles on 5/14/15.
 */
public enum DieFace {
    BLANK(ActionType.BLANK),
    HIT(ActionType.HIT),
    ACCURACY(ActionType.ACCURACY),
    MORALE(ActionType.MORALE),
    SURGE(ActionType.SURGE),
    HIT_HIT(ActionType.HIT, ActionType.HIT),
    HIT_SURGE(ActionType.HIT, ActionType.SURGE),
    HIT_ACCURACY(ActionType.HIT, ActionType.ACCURACY),
    HIT_MORALE(ActionType.HIT, ActionType.MORALE),
    SURGE_SURGE(ActionType.SURGE, ActionType.SURGE),
    SURGE_MORALE(ActionType.SURGE, ActionType.MORALE),
    MORTAL_STRIKE(ActionType.MORTAL_STRIKE);

    private List<ActionType> actions = new ArrayList<>();

    private DieFace(){}
    private DieFace(ActionType at) {
        actions.add(at);
    }
    private DieFace(ActionType a1, ActionType a2) {
        actions.add(a1);
        actions.add(a2);
    }

    public List<ActionType> getActions() {
        return actions;
    }
}
