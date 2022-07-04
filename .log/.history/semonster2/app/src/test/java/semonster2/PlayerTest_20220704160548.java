package semonster2;

import org.junit.Assert;
import org.junit.Test;



public class PlayerTest {

  @Test
  public void testPlayer1() {
    Player player = new Player(0, 0);
    Assert.assertEquals("スライム:レア度[0]\n", monster.toString());
  }

}
