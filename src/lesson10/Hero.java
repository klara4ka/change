package lesson10;

import java.util.SortedMap;

public abstract class Hero {
    private String name;

    public void getName (String name) {
        this.name = name;
        System.out.println("Имя геря " + name);
    }

    public abstract void attackEnemy(Enemy enemy);
}
