package rwcsim.basicutils.states;

import rwcsim.basicutils.concepts.Unit;

public class EngagedState implements Engaged {
    Unit engagedWith;

    public EngagedState(Unit unit) {
        engagedWith = unit;
    }

    public Unit getEngagedWith() {
        return engagedWith;
    }

}
