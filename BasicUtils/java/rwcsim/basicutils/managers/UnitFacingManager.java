package rwcsim.basicutils.managers;

import rwcsim.basicutils.UnitFace;
import rwcsim.basicutils.concepts.Manager;

public class UnitFacingManager implements Manager {
    public boolean checkFlanking(UnitFace attacker, UnitFace defender) {
        if (attacker == UnitFace.FRONT) {
            switch(defender) {
                case FRONT: return false;
                case LEFT:
                case RIGHT:
                case REAR:
                    return true;
            }
        }
        return false;
    }
}
