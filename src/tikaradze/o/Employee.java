package tikaradze.o;

public class Employee {
    private String firstName;
    private String lastName;
    private int monthlyIncome;
    private int nbHoursPerWeek;
    private String empType;

    public Employee() {
    }

    public Employee(String firstName, String lastName, int monthlyIncome, int nbHoursPerWeek, String empType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlyIncome = monthlyIncome;
        this.nbHoursPerWeek = nbHoursPerWeek;
        this.empType = empType;
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


    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
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
