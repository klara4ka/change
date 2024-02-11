package lesson10;

public class Archer extends Hero {

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(10);
        System.out.println("Archer" + " атакует ПРОТИВНИКА" + " урон составляет " + "10");
    }
}