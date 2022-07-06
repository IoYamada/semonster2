package semonster2;

import java.util.LinkedList;

public class seMonsterGame {
  private Player player1;
  private Player player2;

  LinkedList<Integer> randomNumberList;

  seMonsterGame(LinkedList<Integer> randomNumberList, LinkedList<Integer> List1, String playerName1,
      LinkedList<Integer> List2, String playerName2) {
    this.player1 = new Player(List1, playerName1);
    this.player1.drawMonsters();
    this.player2 = new Player(List2, playerName2);
    this.player2.drawMonsters();
    this.randomNumberList = randomNumberList;
  }

  public void drawMonsters() {
    for (int i = 0; i < 5; i++) {
      this.monsterDeck.add(new Monster(this.randomNumberList.pop(), this.randomNumberList.pop()));
    }
  }

  @Override
  public String toString() {
    return this.player1.name + " vs " + this.player2.name + "]\n";
  }

}