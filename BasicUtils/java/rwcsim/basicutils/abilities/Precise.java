package rwcsim.basicutils.abilities;

import rwcsim.basicutils.concepts.Ability;
import rwcsim.basicutils.runes.RuneFaces;
import rwcsim.basicutils.runes.RuneManager;

public interface Precise extends Ability<Precise> {
    static Precise asAbility(int i) {
        return (Precise) new NullAbility(i);
    }

    static Precise asAbility(RuneFaces rf) {
        Precise ability = (Precise) new NullAbility(rf.ordinal());
        ability.activateOther();
        return ability;
    }

    default int getValue() {
        if (useOther()) {
            return RuneManager.getInstance().currentRuneCount(RuneFaces.getFace(getOtherValue()));
        }
        return getOtherValue();
    }
}
