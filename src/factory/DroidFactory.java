package factory;

import model.unit.DroidInterface;

public interface DroidFactory {
    DroidInterface createDroid(int value);
}
