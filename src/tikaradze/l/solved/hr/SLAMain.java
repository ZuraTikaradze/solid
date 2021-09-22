package tikaradze.l.solved.hr;

import java.util.ArrayList;
import java.util.List;

/**
 * აქ მარტო კონტრაქტორ თანამშრომლებზე წამოვიღებ
 */
public class SLAMain {
    public static void main(String[] args) {

        List<Contractor> employees = new ArrayList<>();

        employees.add(new Contractor("Jhon", 2));


        for (Contractor employee : employees) {
            employee.approveSLA();
        }
    }
}
