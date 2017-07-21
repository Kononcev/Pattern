package factory;

public class DroidCreator {
    public DroidFactory createFactory(int value) throws RuntimeException {
        switch (value) {
            case (1):
                return new SimpleDroidFactory();
            case (2):
                return new SuperDroidFactory();
            default:
                throw new RuntimeException();
        }
    }
}
