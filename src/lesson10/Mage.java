package lesson10;

public class Mage extends Hero {
    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(25);
        System.out.println("Mage" + " атакует ПРОТИВНИКА" + " урон составляет " + "25");

    }
}