package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class seMonsterGameTest {
  @Test
  public void appHasAGreeting() {
    App classUnderTest = new App();
    assertNotNull("こんにちは SEMonster", classUnderTest.getGreeting());
  }
}
