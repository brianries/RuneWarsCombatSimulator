package rwcsim.basicutils.states;

import rwcsim.basicutils.concepts.State;

public class LingeringDead implements State<LingeringDead> {
    @Override
    public LingeringDead getType() {
        return this;
    }
}
