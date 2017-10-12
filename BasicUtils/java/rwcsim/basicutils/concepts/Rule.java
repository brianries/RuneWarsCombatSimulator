package rwcsim.basicutils.concepts;

public interface Rule<T> {
    public String name();
    public boolean isEnabled();
    public T getRule();
}
