package employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements EmployeeInterface {
    private List<Employee> employees = new ArrayList<>();

    @Override
    public boolean add(Employee employee) {
        employees.add(employee);

        return true;
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);

    }

    @Override
    public List<Employee> listEmployees() {
        return employees;
    }
}
