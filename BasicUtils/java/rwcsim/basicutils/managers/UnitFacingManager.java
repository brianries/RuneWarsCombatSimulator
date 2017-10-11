package rwcsim.basicutils.managers;

import rwcsim.basicutils.UnitFace;

public class UnitFacingManager {
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
