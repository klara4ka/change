package lesson10;

public class  Warrior extends Hero {
    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(35);
        System.out.println("Warrior" + " атакует ПРОТИВНИКА" + " урон составляет " + "35");
    }
}


