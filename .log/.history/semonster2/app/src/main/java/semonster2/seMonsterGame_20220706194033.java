package semonster2;

import java.util.LinkedList;

public class seMonsterGame {
  private Player player1;
  private Player player2;

  LinkedList<Integer> randomNumberList;

  seMonsterGame(LinkedList<Integer> randomNumberList, String playerName) {
    this.player1 = playerName;
    this.randomNumberList = randomNumberList;
  }

}
