package employee;

import java.util.List;

public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {

        this.employeeRepository = employeeRepository;

    }

    /**
     * Validate Employee object and add it to the list.
     *
     * @param employee instance
     * @return value representing a status
     */

    public String validateAndAddEmployee(Employee employee) {
        // smth

        boolean responseFromRepo = employeeRepository.add(employee);
        if (responseFromRepo) {
            return "Employee added with succes";

        }
        return "Revise employee parameters";
    }

    public void validateAndDeleteEmployee(Employee employee) {
        employeeRepository.remove(employee);
    }

    public List<Employee> getEmployees() {
        return employeeRepository.listEmployees();
    }
}
