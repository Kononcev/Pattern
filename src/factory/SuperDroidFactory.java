package factory;

import adapter.LuckyAdapterForDroid;
import adapter.ShieldAdapterForDroid;
import adapter.SuperDroidInterface;
import adapter.SwordAdapterForDroid;
import constant.Constant;
import model.unit.Droid;

public class SuperDroidFactory implements DroidFactory {
    public SuperDroidInterface createDroid(int value) throws RuntimeException {
        SuperDroidInterface unit;
        if (value==1)
            unit = new SwordAdapterForDroid(new Droid(Constant.SWORD_DROID_NAME, Constant.DAMAGE, Constant.DEFENCE, Constant.HEALTH, Constant.AVOID_CHANCE));
        else if (value==2)
            unit = new ShieldAdapterForDroid(new Droid(Constant.SHIELD_DROID_NAME, Constant.DAMAGE, Constant.DEFENCE, Constant.HEALTH, Constant.AVOID_CHANCE));
        else if (value==3)
            unit = new LuckyAdapterForDroid(new Droid(Constant.LUCKY_DROID_NAME, Constant.DAMAGE, Constant.DEFENCE, Constant.HEALTH, Constant.AVOID_CHANCE));
        else
            throw new RuntimeException();
        return unit;
    }
}
