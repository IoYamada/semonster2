package semonster2;

import org.junit.Assert;
import org.junit.Test;
import java.util.LinkedList;



public class PlayerTest {

  @Test
  public void testPlayer1() {
    LinkedList<Integer> list = new LinkedList<>();
    Player player = new Player(list,"human1");
    Assert.assertEquals("スライム:レア度[0]\n", monster.toString());
  }

}
