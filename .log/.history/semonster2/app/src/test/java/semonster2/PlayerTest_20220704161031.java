package semonster2;

import org.junit.Assert;
import org.junit.Test;



public class PlayerTest {

  @Test
  public void testPlayer1() {
    LinkedList<Integer> list = new LinkedList<>();
    Player player = new Player(0,"human1");
    Assert.assertEquals("スライム:レア度[0]\n", monster.toString());
  }

}
