package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
  @Test
  public void testSummonMonster1() {
    Monster monster = new Monster(0,0);
    assertNotNull("こんにちは SEMonster", classUnderTest.getGreeting());
  }
}
