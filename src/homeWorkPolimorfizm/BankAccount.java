package homeWorkPolimorfizm;

public class BankAccount {
    double amount;
// пополнение и списание происходит без комиссии.
    public double getAmount(double amount) {
        System.out.println(amount);
        return 0;
    }
// Если передать в метод пополнения отрицательное значение, сумма на счёте не должна измениться.
    public void put(double amountToPut) {
        if (amountToPut < 0) {
            System.out.println(amount);
        } else {
            System.out.println( "Остаток на карте после пополнения " + (amount += amountToPut));
        }
    }
//При попытке снять большую сумму, чем есть на счёте, сумма не списывается со счёта, сумма на счёте не изменяется.
    public void take (double amountToTake) {
        if(amountToTake > amount) {
            System.out.println(amount);
        } else {
            System.out.println("Остаток на крате после снятия " + (amount -= amountToTake));
        }

    }
}


