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

    /*LinkedList<Integer> list = new LinkedList<>();

    for (int i = 0; i < 5; i++) {
      list.add(i);
      list.add(i);
    }

    Player player = new Player(list, "human1");

    player.drawMonsters();
    System.out.println(player.toString());
  }*/

  LinkedList<Integer> list = new LinkedList<>();
  LinkedList<Integer> list1 = new LinkedList<>();
  LinkedList<Integer> list2 = new LinkedList<>();

  /* 勝敗用List */
  list.add(2);
  list.add(3);

  for (int i = 0; i < 5; i++) {
    list1.add(i);
    list1.add(i);
    list2.add(i);
    list2.add(i);
  }

  seMonsterGame gameTest = new seMonsterGame(list, list1, "player1", list2, "player2");
  System.out.println(gameTest.battle());
  
}
