package model.component;

import model.unit.DroidInterface;

public class Shield extends DroidDecorator {
    private DroidInterface droid;

    public Shield (DroidInterface droid) {
        this.droid = droid;
    }

    @Override
    public int hit() {
        return droid.hit();
    }

    @Override
    public double avoidAttack() {
        return droid.avoidAttack();
    }

    @Override
    public int blockDamage() {
        return droid.blockDamage()*2;
    }

    @Override
    public String toString() {
        return "Now Your droid has shield, his defence increased by 2\n" + droid;
    }
}
