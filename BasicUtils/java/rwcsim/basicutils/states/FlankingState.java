package rwcsim.basicutils.states;

import rwcsim.basicutils.concepts.State;
import rwcsim.basicutils.unit.Unit;

public class FlankingState implements Flanking {
    Unit flanking;

    public FlankingState(Unit unit) {
        flanking = unit;
    }

    public Unit getFlanking() {
        return flanking;
    }
}
