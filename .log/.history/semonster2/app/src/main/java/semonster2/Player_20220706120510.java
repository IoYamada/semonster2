package semonster2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Player {

  String name;
  ArrayList<Monster> monsterDeck = new ArrayList<>();
  int hitPint;

  LinkedList<Integer> randomNumberList;

  Player(LinkedList<Integer> randomNumberList, String playerName, int playerHitPoint) {

    this.randomNumberList = randomNumberList;
    this.name = playerName;
    this.hitPint = playerHitPoint;

  }

  public void drawMonsters() {
    for (int i = 0; i < 8; i++) {
      this.monsterDeck.add(new Monster(this.randomNumberList.pop(), this.randomNumberList.pop()));
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Deck:" + this.name + " HP:" + this.hitPint + "\n");

    for (Monster m : this.monsterDeck) {
      sb.append(m);
    }

    return sb.toString();
  }
}
