package model.unit;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<DroidInterface> army;

    public Army() {
        this.army = new ArrayList<>();
    }

    public List<DroidInterface> getArmy() {
        return army;
    }

    public void setArmy(List<DroidInterface> army) {
        this.army = army;
    }
}
