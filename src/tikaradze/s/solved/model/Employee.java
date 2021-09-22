package tikaradze.s.solved.model;

public class Employee {
    private String firstName;
    private String lastName;
    private int monthlyIncome;
    private int nbHoursPerWeek;

    public Employee() {
    }

    public Employee(String firstName, String lastName, int monthlyIncome, int nbHoursPerWeek) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlyIncome = monthlyIncome;
        this.nbHoursPerWeek = nbHoursPerWeek;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(int monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public int getNbHoursPerWeek() {
        return nbHoursPerWeek;
    }

    public void setNbHoursPerWeek(int nbHoursPerWeek) {
        this.nbHoursPerWeek = nbHoursPerWeek;
    }

    public String getEmail() {
        return this.firstName + "." + lastName + "@company.com";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", monthlyIncome=" + monthlyIncome +
                ", nbHoursPerWeek=" + nbHoursPerWeek +
                '}';
    }

}
