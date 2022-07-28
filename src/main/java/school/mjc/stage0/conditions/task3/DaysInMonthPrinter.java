package school.mjc.stage0.conditions.task3;

import java.time.YearMonth;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if(month > 12 || month < 1)
            System.out.println("wrong number!");
        else
            System.out.println(YearMonth.of(2022, month).lengthOfMonth());
    }
}
