package rwcsim.utils.dice;

/**
 * Created by dsayles on 5/14/15.
 */
public abstract class Die {
    DieFace[] faces;
    public Die() {
        setFaces();
    }
    public abstract void setFaces();
    public DieFace result(int value) { return faces[value]; }
}
