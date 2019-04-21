package person;

public class Employee extends Human {


    public int getEmployeeSalary() {
        return employeeSalary;
    }


    public int getJobId() {
        return jobId;
    }


    public String getJobPosition() {
        return jobPosition;
    }


    public Employee(String firstName, String lastName, int age, int employeeSalary, String jobPosition, int jobId) {

        super(firstName, lastName, age);
        this.employeeSalary = employeeSalary;
        this.jobId = jobId;
        this.jobPosition = jobPosition;

    }


    private int employeeSalary;
    private int jobId;
    private String jobPosition;

}
