package tikaradze.l.problem.hr;

import java.util.ArrayList;
import java.util.List;


// ამ შემთხვევაში გვიგდებს შეცდომას რადგან ნაციონალურ დასვენების დღეებშ ბონუსები არ იანგარიშება კონტრაქტორ თანამშრომლებზე.

public class NationaliDayEmplMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new FullTime("zura", 12));
        employees.add(new Contractor("Jhon", 2));


        for (Employee employee : employees) {
                employee.requestTimeOff(10, new FullTime("Zu",2));
        }
    }
}
