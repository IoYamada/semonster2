/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package semonster2;

import org.junit.Assert;
import org.junit.Test;

public class MonsterTest {
  @Test
  public void testSummonMonster1() {
    Monster monster = new Monster(3, 3);
    Assert.assertEquals("キングデュラハン:レア度[3]\n", monster.toString());
  }
}
