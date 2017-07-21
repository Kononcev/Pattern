package model.unit;

public class RepairDroid extends Unit implements DroidInterface{
    private int repair;

    public RepairDroid(String name, int health, int repair) {
        super(name, health);
        this.repair = repair;
    }

    @Override
    public int hit() {
        return 0;
    }

    @Override
    public double avoidAttack() {
        return 0;
    }

    @Override
    public int blockDamage() {
        return 0;
    }

    @Override
    public int repair() {
        return repair;
    }

    @Override
    public String toString() {
        return "RepairDroid{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", alive=" + alive +
                ", repair" + repair +
                '}';
    }
}
