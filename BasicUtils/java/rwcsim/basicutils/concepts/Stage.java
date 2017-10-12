package rwcsim.basicutils.concepts;

public interface Stage<T> {
    class Key<T> {}
    Key<T> key();
}
