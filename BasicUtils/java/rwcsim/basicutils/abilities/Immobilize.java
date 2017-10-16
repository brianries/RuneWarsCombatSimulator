package rwcsim.basicutils.abilities;

import rwcsim.basicutils.concepts.Ability;
import rwcsim.basicutils.runes.RuneFaces;
import rwcsim.basicutils.runes.RuneManager;

public interface Immobilize extends Ability<Immobilize> {
    static Immobilize asAbility(int i) {
        return (Immobilize) new NullAbility(i);
    }

    static Immobilize asAbility(RuneFaces rf) {
        Immobilize ability = (Immobilize) new NullAbility(rf.ordinal());
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
