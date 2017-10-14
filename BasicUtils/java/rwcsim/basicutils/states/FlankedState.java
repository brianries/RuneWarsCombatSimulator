package rwcsim.basicutils.states;

import rwcsim.basicutils.concepts.Unit;

public class FlankedState implements Flanked {
    Unit flankedBy;

    public FlankedState(Unit by) {
        flankedBy = by;
    }

    public Unit getFlankedBy() {
        return flankedBy;
    }

}
