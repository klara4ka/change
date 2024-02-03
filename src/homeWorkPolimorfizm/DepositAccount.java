package homeWorkPolimorfizm;

import java.time.LocalDate;
import java.time.Period;

public class DepositAccount extends BankAccount {

    LocalDate lastIncome = LocalDate.now();

    @Override
    public void take (double amountToTake) {
        Period between = Period.between(lastIncome, LocalDate.now());
        if (between.getMonths() >= 1); {
          super.take(amountToTake);
        } else {
            System.out.println("Нельзя снимать деньги в течение одного месяца после последнего пополнения");
        }
    }


}
