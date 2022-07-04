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
    list.add(0);
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    Player player = new Player(list, "human1");
    Monster monster1 = new Monster(0, 0);

    player.monsterDeck.add(monster1);

    player.drawMonsters();
    System.out.println(player.toString());
  }

}
