package factory;

import constant.Constant;
import model.unit.Droid;
import model.unit.DroidInterface;
import model.unit.RepairDroid;

public class SimpleDroidFactory implements DroidFactory {
    @Override
    public DroidInterface createDroid(int value) throws RuntimeException{
        DroidInterface unit;
        if (value==1)
            unit = new Droid(Constant.DROID_NAME, Constant.DAMAGE, Constant.DEFENCE, Constant.HEALTH, Constant.AVOID_CHANCE);
        else if (value==2)
            unit = new RepairDroid(Constant.REPAIR_DROID_NAME, Constant.HEALTH, Constant.REPAIR);
        else
            throw new RuntimeException();
        return unit;
    }
}
