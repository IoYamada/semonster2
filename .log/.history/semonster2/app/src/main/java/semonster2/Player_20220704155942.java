package semonster2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Player {

  String name;
  ArrayList<Monster> monsterDeck = new ArrayList<>();

  LinkedList<Integer> randomNumberList;

  Player(LinkedList<Integer> randomNumberList, String playerName) {
    this.randomNumberList = randomNumberList;
    this.name = playerName;
  }

  public void drawMonsters() {
    for (int i = 0; i < 5; i++) {
      this.monsterDeck.add(new Monster(this.randomNumberList.pop(), this.))
    }
  }
}
