package rwcsim.utils.dice;

/**
 * Created by dsayles on 5/14/15.
 */
public abstract class Die {
    int dieType;
    DieFace[] faces;
    public Die() {
        setFaces();
    }
    public abstract void setFaces();
    public DieFace result(int value) { return faces[value]; }
    public int getDieType(){return dieType;}
}
