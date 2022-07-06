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
    Assert.assertEquals("Deck:human1\nスライム:レア度[0]\nサハギン:レア度[1]\nドラゴン:レア度[2]\nキングデュラハン:レア度[3]\nキングシーサーペント:レア度[4]\n",
        player.toString());
  }

}
