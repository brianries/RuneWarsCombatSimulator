package rwcsim.basicutils.abilities;

import rwcsim.basicutils.concepts.Ability;
import rwcsim.basicutils.morale.MoraleType;
import rwcsim.basicutils.runes.RuneFaces;
import rwcsim.basicutils.runes.RuneManager;

public class NullAbility<T> implements Ability<T> {
    public int KEY;
    boolean secondary = false;
    int value;
    int value2;


    public NullAbility() {}
    public NullAbility(int v) {
        this.value = v;
    }

    public NullAbility(int v, int v2) {
        this.value = v;
        this.value2 = v2;
    }

    public NullAbility(MoraleType mt, int v) {
        this.value2 = mt.ordinal();
        this.value = v;
    }


//    @Override
    public boolean useOther() { return secondary; }

//    @Override
    public void activateOther() { secondary = true; }

//    @Override
    public int getSecondaryValue() { return value2; }
    public void setSecondaryValue(int v) { value2 = v; }

    public int getOtherValue() { return value; }

    public int getValue() {
        if (useOther()) {
            return RuneManager.getInstance().currentRuneCount(RuneFaces.getFace(getOtherValue()));
        }
        return getOtherValue();
    }

    public void setValue(int v) {
        this.value = v;
    }
    public int getKey() { return KEY; }
    public void setKey(int key) { this.KEY = key; }

}
