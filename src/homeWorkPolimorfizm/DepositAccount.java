package homeWorkPolimorfizm;

import java.time.LocalDate;
import java.time.Period;

public class DepositAccount extends BankAccount {

    LocalDate lastIncome = LocalDate.now();

    @Override
    public void take (double amountToTake) {
        Period between = Period.between(lastIncome, LocalDate.now());
        if (!between.isNegative())
    }


}
