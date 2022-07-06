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

    int hp = 50;

    Player player = new Player(list, "human1", hp);

    player.drawMonsters();
    Assert.assertEquals(
        "Deck:human1 HP:50\nスライム:レア度[0]\nサハギン:レア度[1]\nドラゴン:レア度[2]\nデュラハン:レア度[3]\nシーサーペント:レア度[4]\nゾンビ:レア度[5]\nドラキュラ:レア度[6]\nワーウルフ:レア度[7]\n",
        player.toString());
  }

}
