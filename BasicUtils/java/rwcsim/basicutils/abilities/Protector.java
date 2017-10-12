package rwcsim.basicutils.abilities;

import rwcsim.basicutils.concepts.Ability;
import rwcsim.basicutils.runes.RuneFaces;
import rwcsim.basicutils.runes.RuneManager;

public interface Protector extends Ability<Protector> {
    static Protector asAbility(int i) {
        return (Protector) new NullAbility(i);
    }

    static Protector asAbility(RuneFaces rf) {
        Protector ability = (Protector) new NullAbility(rf.ordinal());
        ability.activateOther();
        return ability;
    }

    default int getValue() {
        if (useOther()) {
            return RuneManager.currentRuneCount(RuneFaces.getFace(getOtherValue()));
        }
        return getOtherValue();
    }

}
