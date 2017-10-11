package rwcsim.base.states;

import rwcsim.factions.base.Unit;

public class FlankingState implements State<FlankingState> {
    Unit flanking;

    public FlankingState(Unit unit) {
        flanking = unit;
    }

    public Unit getFlanking() {
        return flanking;
    }

    @Override
    public FlankingState getType() {
        return this;
    }
}
