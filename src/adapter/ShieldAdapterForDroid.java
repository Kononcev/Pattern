package adapter;

import model.component.Shield;
import model.unit.DroidInterface;

public class ShieldAdapterForDroid implements SuperDroidInterface{
    private DroidInterface droid;

    public ShieldAdapterForDroid(DroidInterface droid) {
        this.droid = new Shield(droid);
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
