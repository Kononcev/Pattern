package model.component;

import model.unit.DroidInterface;

public class LuckChance extends DroidDecorator {
    private DroidInterface droid;

    public LuckChance(DroidInterface droid) {
        this.droid = droid;
    }

    @Override
    public int hit() {
        return droid.hit();
    }

    @Override
    public double avoidAttack() {
        return droid.avoidAttack()*2;
    }

    @Override
    public int blockDamage() {
        return droid.blockDamage();
    }

    @Override
    public String toString() {
        return "Now your Droid is more lucky, his avoid chance has increased by 2\n" + droid;
    }
}
