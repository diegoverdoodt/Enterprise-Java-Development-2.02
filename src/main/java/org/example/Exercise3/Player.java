package org.example.Exercise3;

public class Player {
    private int health, strength, lives;
    final static int healthIntial = 100;

    public Player(int strength, int lives) {
        int health = healthIntial;
        setStrength(strength);
        setLives(lives);
    }

    public void decrements(){
        if (getLives()-1 < 1){
            throw new IllegalArgumentException("El jugador ha muerto");
        } else {
            setLives(getLives() - 1);
            setHealth(healthIntial);
        }
    }

    public void attack(Player playerA, Player playerB){
        if (playerB.getHealth()- playerA.strength > 0) {
            playerB.setHealth(playerB.getHealth()- playerA.strength);
        } else if (playerB.getHealth()- playerA.strength <= 0 & playerB.getLives() >0) {
            playerB.decrements();
            System.out.println("El ataque del jugador A ha matado al jugador B. B ha perdido una vida");
        } else if (playerB.getLives() <1 ){
            throw new IllegalArgumentException("El jugador B ya no tiene más vidas");
        }

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}