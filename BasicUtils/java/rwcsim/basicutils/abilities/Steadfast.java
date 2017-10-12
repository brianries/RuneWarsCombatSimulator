package rwcsim.basicutils.abilities;

import rwcsim.basicutils.concepts.Ability;
import rwcsim.basicutils.morale.MoraleType;

public interface Steadfast extends Ability<Steadfast> {
    default MoraleType getType() {
        return MoraleType.getType(getValue());
    }

    static Steadfast asAbility(MoraleType type, int value) {
        return (Steadfast) new NullAbility(type.ordinal(), value);
    }
}
