package tikaradze.l.problem.hr;

public class FullTime extends Employee {
    public FullTime(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
    }

    @Override
    public void requestTimeOff(int nbDays, Employee manager) {
        System.out.println("Day Off");
    }
}
