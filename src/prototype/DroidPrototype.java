package prototype;

import model.unit.Droid;

public class DroidPrototype<T> {
    private T original;

    private void setPrototype(T droid){
        original = droid;
    }

    public DroidPrototype(T droid) {
        setPrototype(droid);
    }

    public T copyFromPrototype(){
        return original;
    }
}
