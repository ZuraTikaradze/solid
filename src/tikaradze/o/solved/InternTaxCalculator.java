package tikaradze.o.solved;

import tikaradze.o.Employee;

public class InternTaxCalculator implements TaxCalculator {
    private final int RETIREMENT_TAX_PERCENTAGE = 10;
    private final int INCOME_TAX_PERCENTAGE = 16;
    private final int BASE_HEALTH_INSURANCE = 100;


    @Override
    public double calculate(Employee employee) {
        if (employee.getMonthlyIncome() < 350) {
            return 0;
        } else {
            return (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;
        }
    }
}
