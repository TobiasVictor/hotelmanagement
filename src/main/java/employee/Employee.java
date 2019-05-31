package employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import person.Human;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends Human {



    private int employeeSalary;
    private int jobId;
    private String jobPosition;

}
