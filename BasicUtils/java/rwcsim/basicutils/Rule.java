package rwcsim.basicutils;

public interface Rule<T> {
    public String name();
    public boolean isEnabled();
    public T getRule();
}
