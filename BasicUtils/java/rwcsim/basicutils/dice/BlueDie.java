package rwcsim.basicutils.dice;

/**
 * Created by dsayles on 5/14/15.
 */
public class BlueDie extends Die {
    public BlueDie() {
        dieType = DiePool.BLUE_DIE;
    }
    @Override
    public void setFaces() {
        faces = new DieFace[8];
        faces[0] = DieFace.BLANK;
        faces[1] = DieFace.HIT;
        faces[2] = DieFace.HIT;
        faces[3] = DieFace.SURGE;
        faces[4] = DieFace.ACCURACY;
        faces[5] = DieFace.HIT_SURGE;
        faces[6] = DieFace.HIT_ACCURACY;
        faces[7] = DieFace.SURGE_SURGE;
    }
}
