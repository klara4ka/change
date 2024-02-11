package lesson10;

public class Enemy implements Mortal {

    private int helth;
    public int takeHealth(int helth) {
        return helth;
    }

    public int setHealth(int helth) {
        this.helth = helth;
        return helth;
    }

    public int getHelth() {
        return helth;
    }


    public int takeDamage(int damage) {
        if (helth > damage) {
            helth -= damage;
            System.out.println("Уровень здоровья ПРОТИВНИКА состовляет " + helth );
        } else {
            System.out.println("Урон ГЕРОЯ превышает уровень здоровьe ПРОТИВНИКА-- Игрок выбыл из игры");
        }
        return getHelth();
    }



    @Override
    public void isAlive () {
        if (helth > 0) {
            System.out.println(true + "здоровье ПРОТИВНИКА больше " + "0" );
        } else {
            System.out.println("Здоровье ПРОТИВНИКА меньше " + "0");

        }

    }


}

