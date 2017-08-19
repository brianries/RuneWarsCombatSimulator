package rwcsim.utils.dice;

/**
 * Created by dsayles on 5/14/15.
 */
public class RedDie extends Die {

    @Override
    public void setFaces() {
        faces = new DieFace[8];
        faces[0] = DieFace.BLANK;
        faces[1] = DieFace.BLANK;
        faces[2] = DieFace.HIT;
        faces[3] = DieFace.HIT;
        faces[4] = DieFace.MORALE;
        faces[5] = DieFace.HIT_HIT;
        faces[6] = DieFace.HIT_MORALE;
        faces[7] = DieFace.HIT_SURGE;
    }
}
