package rwcsim.factions.waiqar;

import rwcsim.base.Formation;
import rwcsim.base.dials.Dial;
import rwcsim.factions.base.Infantry;
import rwcsim.factions.base.Unit;
import rwcsim.test.CoreUnit;
import rwcsim.utils.dice.DiePool;

/**
 * Created by dsayles on 8/18/17.
 */
public class Reanimates extends CoreUnit implements Unit, Infantry {
    private Dial maneuverDial;
    private Dial modifierDial;


    public Reanimates() {
        super();
    }
    public Reanimates(Formation formation, int[] unitStats, DiePool diePool){
        super(formation, unitStats, diePool);
    }

}
