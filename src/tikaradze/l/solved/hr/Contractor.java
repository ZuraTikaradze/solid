package tikaradze.l.solved.hr;

public class Contractor {

    public String fullName;
    public int monthlyIncome;

    public Contractor(String fullName, int monthlyIncome) {
        this.fullName = fullName;
        this.monthlyIncome = monthlyIncome;
    }

    public void approveSLA() {
        System.out.println("SLA Logic");
    }
}
