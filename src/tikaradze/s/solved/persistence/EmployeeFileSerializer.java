package tikaradze.s.solved.persistence;


import tikaradze.s.solved.model.Employee;

public class EmployeeFileSerializer {
    // 1. მხოლოდ ერთი მიზეზიაქვს შესაცვლელად - თანამშრომლის აგება (სერიალიზირება)
    public static String serialize(Employee employee) {
        StringBuilder sb = new StringBuilder();
        sb.append("### EMPLOYEE RECORD");
        sb.append(System.lineSeparator());
        sb.append("Name : " + employee.getFirstName() + " " + employee.getLastName());
        sb.append(System.lineSeparator());
        sb.append("EMAIL : " + employee.getEmail());
        return sb.toString();

    }
}
