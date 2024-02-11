package lesson10;

public class BattleGround {
    public static void main(String[] args) {
        Mage mage = new Mage();
        Archer archer = new Archer();
        Warrior warrior= new Warrior();
        Enemy enemy = new Enemy();


        mage.attackEnemy(enemy);
        enemy.setHealth(80);
        enemy.takeDamage(10);
        archer.attackEnemy(enemy);
        enemy.getHelth();
        System.out.println(enemy.getHelth());
    }
}
