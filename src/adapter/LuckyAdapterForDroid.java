package adapter;

import model.component.LuckChance;
import model.unit.DroidInterface;

public class LuckyAdapterForDroid implements SuperDroidInterface{
    private DroidInterface droid;

    public LuckyAdapterForDroid(DroidInterface droid) {
        this.droid = new LuckChance(droid);
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
