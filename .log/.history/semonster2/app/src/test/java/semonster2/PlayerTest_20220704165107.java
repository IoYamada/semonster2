package semonster2;

import org.junit.Assert;
import org.junit.Test;
import java.util.LinkedList;

public class PlayerTest {

  @Test
  public void testPlayer1() {
    LinkedList<Integer> list = new LinkedList<>();

    for (int i = 0; i < 8; i++) {

      list.add(i);
      list.add(i);

    }
    Player player = new Player(list, "human1");

    player.drawMonsters();
    Assert.assertEquals("Deck:human1\nスライム:レア度[0]\nサハギン:レア度[1]\nドラゴン:レア度[2]\nデュラハン:レア度[3]\nシーサーペント:レア度[4]\n",
        player.toString());
  }

}
