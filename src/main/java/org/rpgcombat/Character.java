package org.rpgcombat;

public class Character {
    int health;
    int level;
    boolean alive;
    int damage;

    public Character(int health, int level, boolean alive, int damage) {
        this.health = health;
        this.level = level;
        this.alive = alive;
        this.damage = damage;
    }

    public int attack() {
        return this.damage;
    }
    public int receiveDamage(int damage) {
        return this.health -= damage;
    }

    public boolean isAlive() {
        if (this.health <= this.damage) {
            return alive = false;
        } else {
            return alive = true;
        }
    }

    public int heal(int heal) {
        if (alive = false) {
            return this.health;
        } else {
            while(this.health < 1000) {
                return this.health += heal;
            }
            return this.health;
        }
    }
}
