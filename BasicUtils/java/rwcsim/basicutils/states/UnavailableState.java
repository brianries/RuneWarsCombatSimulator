package rwcsim.basicutils.states;

import rwcsim.basicutils.concepts.State;

public class UnavailableState implements State<UnavailableState> {
    @Override
    public UnavailableState getType() {
        return this;
    }
}
