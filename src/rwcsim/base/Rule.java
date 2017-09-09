package rwcsim.base;

public interface Rule<T> {
    public String name();
    public boolean isEnabled();
    public T getRule();
}