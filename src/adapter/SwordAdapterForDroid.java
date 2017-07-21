package adapter;

import model.component.Sword;
import model.unit.DroidInterface;

public class SwordAdapterForDroid implements SuperDroidInterface {
    DroidInterface droid;

    public SwordAdapterForDroid(DroidInterface droid) {
        this.droid = new Sword(droid);
    }

    @Override
    public int hitWithSword() {
        return droid.hit();
    }

    @Override
    public double superAvoidChance() {
        return droid.avoidAttack();
    }

    @Override
    public int blockWithShield() {
        return droid.blockDamage();
    }

    @Override
    public String toString() {
        return droid.toString();
    }
}
