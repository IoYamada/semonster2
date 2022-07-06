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

  public String battle() {
    String message;
    Monster monster1;
    Monster monster2;

    if(monster1.rare > 0){
      message = this.player1.name;
    }else{
      message = "Winner :" + this.player2.name;
    }
    return message;
  }

  @Override
  public String toString() {
    return this.player1.name + " vs " + this.player2.name + "]\n";
  }

}
