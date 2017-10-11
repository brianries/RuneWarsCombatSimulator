package rwcsim.base.states;

import rwcsim.factions.base.Unit;

public class EngagedState implements State<EngagedState> {
    Unit engagedWith;

    public EngagedState(Unit unit) {
        engagedWith = unit;
    }

    public Unit getEngagedWith() {
        return engagedWith;
    }

    @Override
    public EngagedState getType() {
        return this;
    }
}
