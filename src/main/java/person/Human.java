package person;

import org.apache.log4j.Logger;

public class Human {
   private final  Logger log = Logger.getLogger(Human.class);
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }


    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    protected void display() {
        log.debug(firstName + " " + lastName + "  " + age);
    }


}
