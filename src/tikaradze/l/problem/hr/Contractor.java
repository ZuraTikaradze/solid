package tikaradze.l.problem.hr;

public class Contractor extends Employee {


    public Contractor(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
    }

    @Override
    public void requestTimeOff(int nbDays, Employee manager) {
        throw new RuntimeException("Not Implemented");
    }


    public void approveSLA() {
        System.out.println("SLA Logic");
    }
}
