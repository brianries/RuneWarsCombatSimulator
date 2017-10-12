package rwcsim.basicutils.states;

import rwcsim.basicutils.concepts.State;
import rwcsim.basicutils.unit.Unit;

public class Flanked implements State<Flanked> {
    Unit flankedBy;

    public Flanked(Unit by) {
        flankedBy = by;
    }

    public Unit getFlankedBy() {
        return flankedBy;
    }

    @Override
    public Flanked getType() {
        return this;
    }
}
