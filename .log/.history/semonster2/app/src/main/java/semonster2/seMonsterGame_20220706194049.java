package semonster2;

import java.util.LinkedList;

public class seMonsterGame {
  private Player player1;
  private Player player2;

  LinkedList<Integer> randomNumberList;

  seMonsterGame(LinkedList<Integer> randomNumberList, String player1) {
    this.player1 = player1;
    this.randomNumberList = randomNumberList;
  }

}
