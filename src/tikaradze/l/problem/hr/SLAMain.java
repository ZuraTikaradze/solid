package tikaradze.l.problem.hr;

import java.util.ArrayList;
import java.util.List;

/**
 * კონტრაქტორი არის ენთითი რომელიც არის ემპლოის მსგავსი სხვადასხვა პროექტებში.
 * ჩვენ გვინდა ჩვენს პროექტში შემოვიტანოთ კონტრაქტორი თანამშრომელი.
 * <p>
 * ჩვენ კონტრაქტორიდან გვაინტერესებს იგივე ინფორმაცია რაც თანამშრომლისგან. (სახელი, იმეილი, თვიური შემოსავალი და  nb საათობრივი ნამუშევარი.
 * <p>
 * დამატებით საჭიროა კონტრაქტორს ჰქონდეს SLA შეთანხმებული სამუშაომდე.
 * რადგან კონტრაქტორები არიან გარე თანამშრომლები, მათ არ შეუძლიათ დეი ოფფის ( TIMEoff ) ის აღება. შესაბამისად გადასახადებსაც ვერ დავითვლით
 */
public class SLAMain {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new FullTime("zura", 12));
        employees.add(new Contractor("Jhon", 2));


        for (Employee employee : employees) {
            if (employee instanceof Contractor) {
                Contractor contractor = (Contractor) employee;
                contractor.approveSLA();
            }
        }
    }
}
