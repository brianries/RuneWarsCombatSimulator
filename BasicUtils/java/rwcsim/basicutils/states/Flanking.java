package rwcsim.basicutils.states;

import rwcsim.basicutils.concepts.State;
import rwcsim.basicutils.unit.Unit;

public class Flanking implements State<Flanking> {
    Unit flanking;

    public Flanking(Unit unit) {
        flanking = unit;
    }

    public Unit getFlanking() {
        return flanking;
    }

    @Override
    public Flanking getType() {
        return this;
    }
}
