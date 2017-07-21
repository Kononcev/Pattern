package adapter;

import constant.Constant;
import model.unit.DroidInterface;

public interface SuperDroidInterface extends DroidInterface{
    int hitWithSword();
    double superAvoidChance();
    int blockWithShield();

    @Override
    default int hit() {
        return Constant.DAMAGE;
    }

    @Override
    default double avoidAttack() {
        return Constant.AVOID_CHANCE;
    }

    @Override
    default int blockDamage() {
        return Constant.DEFENCE;
    }
}
