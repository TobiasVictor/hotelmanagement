package person;

public class Employee extends Human {


    public Employee(String firstName, String lastName, int age, int employeeSalary, String jobPosition, int jobId) {
        super(firstName, lastName, age);
        this.employeeSalary=employeeSalary;
        this.jobId=jobId;
        this.jobPosition=jobPosition;

    }
    private int employeeSalary;
    private int  jobId;
    private String jobPosition;

}
