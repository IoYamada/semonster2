package semonster2;

import org.junit.Assert;
import org.junit.Test;
import java.util.LinkedList;

public class PlayerTest {

  @Test
  public void testPlayer1() {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(0);
    list.add(0);
    list.add(1);
    list.add(1);
    list.add(2);
    list.add(2);
    list.add(3);
    list.add(3);
    list.add(4);
    list.add(4);
    Player player = new Player(list, "human1");

    player.drawMonsters();
    Assert.assertEquals("スライム:レア度[0]\n
                        サハギン:レア度[1]\n
                        ドラゴン:レア度[2]\n
                        デュラハン:レア度[3]\n
                        シーサーペント:レア度[4]\n", player.toString());
  }

}
