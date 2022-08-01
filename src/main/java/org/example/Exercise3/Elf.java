package org.example.Exercise3;

public class Elf extends Player {

    private int velocity;

    public Elf(int health, int strength, int lives, int velocity) {
        super(strength, lives);
        setVelocity(velocity);
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }
}
