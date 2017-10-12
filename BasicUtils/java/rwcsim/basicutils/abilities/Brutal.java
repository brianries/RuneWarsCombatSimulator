package rwcsim.basicutils.abilities;

import rwcsim.basicutils.concepts.Ability;
import rwcsim.basicutils.runes.RuneFaces;
import rwcsim.basicutils.runes.RuneManager;

public interface Brutal extends Ability<Brutal> {

    static Brutal asAbility(int i) {
        return (Brutal) new NullAbility(i);
    }

    static Brutal asAbility(RuneFaces rf) {
        Brutal ability = (Brutal) new NullAbility(rf.ordinal());
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
