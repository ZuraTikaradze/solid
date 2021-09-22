package tikaradze.s.problem;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.PublicKey;

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

    // პრობლემა:
    // ამ მეთოდს რამოდენიმე მიზეზი აქვს შესაცვლელად
    // 1. თანამშრომლის აგება (სერიალიზაცია )
    // 2. ფაილთან წვდომა და ჩაწერა
    // 3. ლოგირება
    // 4. ექსეფშენ ჰენდლინგი
    // გადაწყვეტა :
    // შევქმნათ კლასები ცალკეული პასუხისმგებლობებით და გავიტანოთ ეს ლოგიკა ცალ-ცალკე
    public static void save(Employee employee) {

        try {
            StringBuilder sb = new StringBuilder();
            sb.append("### EMPLOYEE RECORD");
            sb.append(System.lineSeparator());
            sb.append("Name : " + employee.firstName + " " + employee.lastName);
            sb.append(System.lineSeparator());
            sb.append("EMAIL : " + employee.getEmail());

            Path path = Paths.get(employee.getFirstName().replace(" ", "_" + ".rec"));
            Files.write(path, sb.toString().getBytes());
            System.out.println("წარმატებული ჩაწერა !");
        } catch (Exception e) {
            System.out.println("დაფიქსირდა შეცდომა : " + e.toString());

        }
    }
}
