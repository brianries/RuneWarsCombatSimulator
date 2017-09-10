package rwcsim.factions.base;

/**
 * Created by dsayles on 8/17/17.
 */
public interface Unit {
    void initializeUnit();

    Siege getAsSiege();
    Infantry getAsInfantry();
    Cavalry getAsCavalry();
    Hero getAsHero();
}
