package person;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.log4j.Logger;
import java.lang.Object;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Human {
   private final  Logger log = Logger.getLogger(Human.class);

   private String firstName;
   private String lastName;
   private int age;
   private Integer cnp;


    protected void display() {
        log.debug(firstName + " " + lastName + "  " + age);
    }
    @Override
    public boolean equals(Object obj){
        if(! (obj instanceof Human))
            return false;
        if (obj == this)
            return true;
        return this.firstName == ((Human) obj).firstName &&
                this.lastName == ((Human) obj).lastName &&
                this.cnp == ((Human) obj).cnp &&
                this.age == ((Human) obj).age;
    }
    @Override
    public int hashCode(){
        final int prime = 31;
        int result =1;
        result = prime * result + ((cnp == 0 ) ? 0 : cnp.hashCode());
        return result;
    }
}
