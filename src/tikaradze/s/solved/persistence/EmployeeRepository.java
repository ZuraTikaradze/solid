package tikaradze.s.solved.persistence;

import tikaradze.s.solved.model.Employee;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EmployeeRepository {
    //2. მხოლოდ ერთი მიზეზი აქვს შესაცვლელად თანამშრომლის შენახვა ( ჩაწერა)
    public static void save(Employee employee) throws Exception {
            String serializedString = EmployeeFileSerializer.serialize(employee);
            Path path = Paths.get(employee.getFirstName().replace(" ", "_" + ".rec"));
            Files.write(path, serializedString.getBytes());
    }
}
