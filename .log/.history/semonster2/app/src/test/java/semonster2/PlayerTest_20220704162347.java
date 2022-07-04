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
    Assert.assertEquals("スライム:レア度[0]\n", player.toString());
  }

}
