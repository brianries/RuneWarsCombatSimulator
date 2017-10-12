package rwcsim.basicutils.states;

import rwcsim.basicutils.concepts.State;
import rwcsim.basicutils.unit.Unit;

public class FlankedState implements Flanked {
    Unit flankedBy;

    public FlankedState(Unit by) {
        flankedBy = by;
    }

    public Unit getFlankedBy() {
        return flankedBy;
    }

}
