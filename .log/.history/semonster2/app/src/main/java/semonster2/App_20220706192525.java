/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package semonster2;

import java.util.LinkedList;

public class App {
  public String getGreeting() {
    return "こんにちは SEMonster";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());

    LinkedList<Integer> list = new LinkedList<>();

    for (int i = 0; i < 5; i++) {
      list.add(i);
      list.add(i);
    }

    Player player = new Player(list, "human1");
    // Monster monster1 = new Monster(0, 0);

    // player.monsterDeck.add(monster1);

    player.drawMonsters();
    System.out.println(player.toString());
  }

}
