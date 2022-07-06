package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;

public class seMonsterGameTest {
  @Test
  public void testseMonsterGame() {
    LinkedList<Integer> list = new LinkedList<>();
    LinkedList<Integer> list1 = new LinkedList<>();
    LinkedList<Integer> list2 = new LinkedList<>();

    /*勝敗用List*/
    list.add(2);
    list.add(3);

    for (int i = 0; i < 5; i++) {
      list1.add(i);
      list1.add(i);
      list2.add(i);
      list2.add(i);
    }

    seMonsterGame gameTest = new seMonsterGame();

    assertNotNull("こんにちは SEMonster", classUnderTest.getGreeting());
  }
}
