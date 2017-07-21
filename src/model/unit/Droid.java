package model.unit;

public class Droid extends Unit implements DroidInterface {
    private int damage;
    private int defence;
    private double avoidChance;

    public Droid(String name, int health, int damage, int defence, double avoidChance) {
        super(name, health);
        this.damage = damage;
        this.defence = defence;
        this.avoidChance = avoidChance;
    }

    @Override
    public int hit() {
        return damage;
    }

    @Override
    public double avoidAttack() {
        return avoidChance;
    }

    @Override
    public int blockDamage() {
        return defence;
    }

    @Override
    public int repair() {
        return 0;
    }
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public double getAvoidChance() {
        return avoidChance;
    }

    public void setAvoidChance(double avoidChance) {
        this.avoidChance = avoidChance;
    }


    @Override
    public String toString() {
        return "Droid{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", defence=" + defence +
                ", health=" + health +
                ", avoidChance=" + avoidChance +
                ", alive=" + alive +
                '}';
    }
}
