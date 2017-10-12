package rwcsim.basicutils.states;

import rwcsim.basicutils.concepts.State;
import rwcsim.basicutils.unit.Unit;

public class Engaged implements State<Engaged> {
    Unit engagedWith;

    public Engaged(Unit unit) {
        engagedWith = unit;
    }

    public Unit getEngagedWith() {
        return engagedWith;
    }

    @Override
    public Engaged getType() {
        return this;
    }
}
