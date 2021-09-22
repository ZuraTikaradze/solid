package tikaradze.o.problem;

import tikaradze.o.solved.TaxCalculator;
import tikaradze.s.problem.Employee;

// ცვლილებამდე
public class TaxCalculatorOld {
    private final int RETIREMENT_TAX_PERCENTAGE = 10;
    private final int INCOME_TAX_PERCENTAGE = 16;
    private final int BASE_HEALTH_INSURANCE = 100;

    public double calculate(Employee employee) {
        return BASE_HEALTH_INSURANCE +
                (employee.getMonthlyIncome() * RETIREMENT_TAX_PERCENTAGE) / 100 +
                (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;
    }

}
