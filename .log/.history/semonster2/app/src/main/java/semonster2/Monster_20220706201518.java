package semonster2;

public class Monster {
  private String name;
  private int rare;

  Monster(int nameNum, int rareNum) {
    this.name = this.summonMonster(nameNum);
    this.rare = rareNum;
    evolutionMonster();
  }

  int getMonsterName() {
    return this.name;
  }

  int getMonsterRare() {
    return this.rare;
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    return monsters[mnumber];
  }

  void evolutionMonster() {
    if (this.rare >= 3) {
      this.name = "キング" + this.name;
    }
    return;
  }

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]\n";
  }
}
