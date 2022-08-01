package org.example.Exercise3;

public class Wizard extends Player {

    private int magic;

    public Wizard(int health, int strength, int lives, int magic) {
        super(strength, lives);
        setMagic(magic);
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }
}
