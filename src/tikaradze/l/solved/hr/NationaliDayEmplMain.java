package tikaradze.l.solved.hr;

import java.util.ArrayList;
import java.util.List;

// აქ მარტო ფულთაიმ თანამშრომლებზე წამოვიღება
public class NationaliDayEmplMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTime("zura", 12));
        for (Employee employee : employees) {
            employee.requestTimeOff(10, new FullTime("Zu", 2));
        }
    }
}
