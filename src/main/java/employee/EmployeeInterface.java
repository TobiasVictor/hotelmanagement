package employee;

import java.util.List;

public interface EmployeeInterface {

    boolean add(Employee employee);

    void remove(Employee employee);

    List<Employee> listEmployees();
}
