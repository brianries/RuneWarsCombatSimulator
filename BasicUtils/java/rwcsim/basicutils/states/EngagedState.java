package rwcsim.basicutils.states;

import rwcsim.basicutils.concepts.State;
import rwcsim.basicutils.unit.Unit;

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
