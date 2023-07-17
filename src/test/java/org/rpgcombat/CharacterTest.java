package org.rpgcombat;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CharacterTest {
  int health = 1000;
  int level = 1;
  boolean alive = true;
  int damage = 100;

  int heal;
  Character character = new Character(health, level, alive, damage);
    @Test
    public void health_should_start_with_1000() {

      assertTrue(character.health >= 1000);
    }
    @Test
    public void level_should_start_at_1() {
      assertTrue(character.level == 1);
    }

    @Test
    public void character_should_be_alive() {
      assertTrue(character.alive);
    }

    @Test
    public void character_should_have_damage() {
      assertNotNull(character.damage);
    }

    @Test
    public void damage_should_substract_from_health() {
      assertTrue(character.attack() == 100);
    }

    @Test
    public void should_substract_damage_from_health() {
      assertEquals(900, character.receiveDamage(100));
    }

    @Test
    public void if_health_is_below_0_character_should_be_dead() {
      assertTrue(character.isAlive());
    }
    @Test
    public void character_should_can_heal(){
      assertEquals(1000,character.heal(100));
    }

    @Test
    public void character_should_not_receive_damage_from_itself() {

    }
}