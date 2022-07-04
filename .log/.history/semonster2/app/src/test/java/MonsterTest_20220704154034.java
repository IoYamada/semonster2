package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
  @Test
  public void testSummonMonster1() {
    Monster monster = new Monster();
    assertNotNull("こんにちは SEMonster", classUnderTest.getGreeting());
  }
}
