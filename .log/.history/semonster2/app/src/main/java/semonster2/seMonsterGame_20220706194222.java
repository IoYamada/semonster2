package semonster2;

import java.util.LinkedList;

public class seMonsterGame {
  private Player player1;
  private Player player2;

  LinkedList<Integer> randomNumberList;

  seMonsterGame(LinkedList<Integer> randomNumberList, LinkedList<Integer> List1, String playerName1) {
    this.player1(List1,playerName1);
    this.randomNumberList = randomNumberList;
  }

}
