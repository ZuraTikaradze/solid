package tikaradze.o;

// Open Closed Principle

import tikaradze.o.solved.FullTimeTaxCalculator;
import tikaradze.o.solved.TaxCalculator;

/**
 * Software Entities should be open for extension, but closed for modification.
 * <p>
 * The design and writing of the code should be done in a way that new functionality
 * should be added with minimum changes in the existing code
 */


// Classes, functions, and modules should be closed for modification, but open for extension.
// Strategy patternia igive
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setFirstName("Zura");
        employee.setMonthlyIncome(1000);
        TaxCalculator taxCalculator;
        taxCalculator = new FullTimeTaxCalculator();
        double tax = taxCalculator.calculate(employee);
        System.out.println(tax);

    }
}
