package model.unit;

public abstract class Unit {
    protected String name;
    protected int health;
    protected boolean alive=false;

    Unit(String name, int health) {
        this.name = name;
        this.health = health;
        this.alive = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public abstract int hit();
    public abstract double avoidAttack();
    public abstract int blockDamage();
    public abstract int repair();
}
