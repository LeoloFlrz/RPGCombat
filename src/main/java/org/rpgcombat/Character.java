package org.rpgcombat;

public class Character {
    int health;
    int level;
    boolean alive = true;
    int strength;

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public Character(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public int attackCharacter(int damage,  Character defensor) {
        if (this == defensor) {
            return defensor.getHealth();
        }
        if (this.alive && defensor.alive) {
            defensor.setHealth(defensor.getHealth() - damage) ;
            if (defensor.getHealth() <= 0) {
                defensor.setHealth(0);
                defensor.setAlive(false);
            }
            return defensor.getHealth();
        }
        return defensor.getHealth();
    }

    public int heal() {
        if (this.isAlive()) {
            this.setHealth(1000);
        } else {
            this.setAlive(false);
            return this.getHealth();
        }
        return this.getHealth();
    }

}
