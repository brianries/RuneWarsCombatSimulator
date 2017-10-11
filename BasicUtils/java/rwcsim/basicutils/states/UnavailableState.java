package rwcsim.basicutils.states;

public class UnavailableState implements State<UnavailableState> {
    @Override
    public UnavailableState getType() {
        return this;
    }
}
