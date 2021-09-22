package tikaradze.l.problem.hr;

public abstract class Employee {
    public String fullName;
    public int monthlyIncome;

    public Employee(String fullName, int monthlyIncome) {
        this.fullName = fullName;
        this.monthlyIncome = monthlyIncome;
    }

    public abstract void requestTimeOff(int nbDays, Employee manager);
}
