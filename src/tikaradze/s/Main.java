package tikaradze.s;

import tikaradze.s.solved.logging.ConsoleLogger;
import tikaradze.s.solved.model.Employee;
import tikaradze.s.solved.persistence.EmployeeRepository;

// Single Responsibility Principle

/**
 * Every Module or class should have responsibility over a single part of the functionality provided by the software,
 * and that responsibility should be entirely encapsulated by the class
 */
// Robert C. Martin - "A class should have only one reason to change"
// Every Function, class or module should have one and only one reson to change.
// "we want to design components that are self-contained: independent, and with a single well-defined purpose"
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setFirstName("Zura");
        employee.setLastName("Tikaradze");
        employee.setMonthlyIncome(1);
        employee.setNbHoursPerWeek(8);

        try {
            EmployeeRepository.save(employee);
            ConsoleLogger.infoLog("ინფორმაცია წარმატებით შეინახა !");
        } catch (Exception e) {
            ConsoleLogger.errorLog("დაფიქსირდა შეცდომა", e);
            e.printStackTrace();
        }
    }
}
