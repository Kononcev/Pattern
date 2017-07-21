package model.component;

import model.unit.DroidInterface;

public class Sword extends DroidDecorator {
    private DroidInterface droid;

    public Sword(DroidInterface droid) {
        this.droid = droid;
    }

    @Override
    public int hit() {
        return droid.hit()*2;
    }

    @Override
    public double avoidAttack() {
        return droid.avoidAttack();
    }

    @Override
    public int blockDamage() {
        return droid.blockDamage();
    }

    @Override
    public String toString() {
        return "Now Your Droid has a sword, he will hitting with double damage\n" + droid;
    }
}
