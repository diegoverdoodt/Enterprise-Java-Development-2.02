package org.example.Exercise3;

public class Warrior extends Player{

    private int attack;

    public Warrior(int health, int strength, int lives, int attack) {
        super(strength, lives);
        setAttack(attack);
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
