package person;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.log4j.Logger;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Human {
   private final  Logger log = Logger.getLogger(Human.class);

   private String firstName;
   private String lastName;
   private int age;
   private int cnp;


    protected void display() {
        log.debug(firstName + " " + lastName + "  " + age);
    }


}
