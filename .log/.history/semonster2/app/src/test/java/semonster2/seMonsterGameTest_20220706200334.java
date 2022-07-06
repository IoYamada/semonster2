package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class seMonsterGameTest {
  @Test
  public void testseMonsterGame() {
    seMonsterGame gameTest = new seMonsterGame();
    assertNotNull("こんにちは SEMonster", classUnderTest.getGreeting());
  }
}
