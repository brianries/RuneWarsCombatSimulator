package rwcsim.base.states;

import rwcsim.factions.base.Unit;

public class FlankedState implements State<FlankedState> {
    Unit flankedBy;

    public FlankedState(Unit by) {
        flankedBy = by;
    }

    public Unit getFlankedBy() {
        return flankedBy;
    }

    @Override
    public FlankedState getType() {
        return this;
    }
}
