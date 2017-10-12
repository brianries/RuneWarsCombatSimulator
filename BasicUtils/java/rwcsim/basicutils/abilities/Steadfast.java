package rwcsim.basicutils.abilities;

import rwcsim.basicutils.concepts.Ability;
import rwcsim.basicutils.morale.MoraleType;

public interface Steadfast extends Ability {
    MoraleType getType();
    int getMoraleValue();
}
