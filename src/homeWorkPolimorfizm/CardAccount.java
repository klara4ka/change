package homeWorkPolimorfizm;

public class CardAccount extends BankAccount {
    @Override
    public void take(double amountToTake) {
            System.out.println("Сумма списания с процентом  " + (amountToTake * 1.01));
        }
    }
