package model.component;


import model.unit.DroidInterface;

public abstract class DroidDecorator implements DroidInterface{
    public abstract int hit();

    public abstract double avoidAttack();

    public abstract int blockDamage();
}
