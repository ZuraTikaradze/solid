package tikaradze.o.problem;


import tikaradze.o.Employee;

// მოითხოვეს ცვლილება : სხვადასხვა ტიპსი თანამშრომლებზე სხვადასხვანაირად ანგარიში ხელფასის
public class TaxCalculator {
    private final int RETIREMENT_TAX_PERCENTAGE = 10;
    private final int INCOME_TAX_PERCENTAGE = 16;
    private final int BASE_HEALTH_INSURANCE = 100;


    // პრობლემა.
    //
    public double calculate(Employee employee) {

        if (employee.getEmpType().equals("Full_Time")) {
            return BASE_HEALTH_INSURANCE +
                    (employee.getMonthlyIncome() * RETIREMENT_TAX_PERCENTAGE) / 100 +
                    (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;
        }


        if (employee.getEmpType().equals("Part_Time")) {
            return BASE_HEALTH_INSURANCE +
                    (employee.getMonthlyIncome() * 5) / 100 +
                    (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;
        }

        if (employee.getEmpType().equals("Intern")) {
            if (employee.getMonthlyIncome() < 350) {
                return 0;
            } else {
                return (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;
            }
        }

        return 0;
    }

}
