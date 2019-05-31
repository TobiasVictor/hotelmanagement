package owner;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import person.Human;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Owner<T extends Human> {

    //using place holder for 1 variable

    private T t;
    private int salary;
    private String education;


}