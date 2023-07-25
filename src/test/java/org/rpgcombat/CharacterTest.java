package org.rpgcombat;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CharacterTest {
  int health = 1000;
  int level = 1;

  Character manolo = new Character(health, level);
  Character juana = new Character(health, level);

  @Test
  public void Health_starting_at_1000() {
    assertTrue(manolo.getHealth() == 1000);
  }

  @Test
  public void Level_starting_at_1() {
    assertTrue(manolo.getLevel() == 1);
  }
  @Test
  public void may_be_Alive_or_Dead_starting_Alive() {
      assertTrue(manolo.alive);
      assertTrue(juana.alive);
  }

  @Test
  public void damage_is_subtracted_from_Health() {
    assertEquals(900, manolo.attackCharacter(100, juana));
    assertEquals(0, juana.attackCharacter(1100, manolo));
  }

  @Test
  public void when_damage_received_exceeds_current_Health_becomes_0_and_the_character_dies() {
    juana.setHealth(100);
    manolo.attackCharacter(150, juana);

    assertEquals(0, juana.getHealth());
    assertFalse(juana.alive);
  }

  @Test
  public void A_Character_can_Heal_a_Character() {
    juana.setHealth(900);
    manolo.setHealth(999);
    juana.heal();
    manolo.heal();
    assertTrue(juana.getHealth() == 1000);
    assertEquals(1000, manolo.getHealth());
  }

  @Test
  public void Dead_characters_cannot_be_healed() {
    manolo.setHealth(50);
    juana.attackCharacter(100, manolo);
    manolo.heal();
    assertFalse(manolo.alive);
  }

  @Test
  public void Healing_cannot_raise_health_above_1000() {
    manolo.setHealth(900);
    manolo.heal();
    assertEquals(1000, manolo.getHealth());
  }

  @Test
  public void A_Character_cannot_Deal_Damage_to_itself() {
    manolo.setStrength(100);
    juana.setStrength(50);

    manolo.attackCharacter(manolo.getStrength(), manolo);
    juana.attackCharacter(juana.getStrength(), juana);

    assertTrue(manolo.isAlive());
    assertTrue(juana.isAlive());
    assertEquals(health, manolo.getHealth());
    assertEquals(health, juana.getHealth());
  }

  @Test
  public void A_Character_can_only_Heal_itself() {

  }
}