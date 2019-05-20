package employee;

import java.util.List;

public interface EmployeeInterface {

    /**
     * Add employee.
     * @param employee instance
     *
     * @return true is inserted
     */

    boolean add(Employee employee);

    void remove(Employee employee);

    List<Employee> listEmployees();
}
