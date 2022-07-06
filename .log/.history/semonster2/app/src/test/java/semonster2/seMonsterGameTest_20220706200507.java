package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;

public class seMonsterGameTest {
  @Test
  public void testseMonsterGame() {
    LinkedList<Integer> list = new LinkedList<>();
    for (int i = 0; i < 5; i++) {
      list.add(i);
      list.add(i);
    }
    seMonsterGame gameTest = new seMonsterGame();

    assertNotNull("こんにちは SEMonster", classUnderTest.getGreeting());
  }
}
