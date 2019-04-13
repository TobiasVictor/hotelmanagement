package person;

public class Human {
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


    public Human() {
        firstName = "George";
        lastName = "Freeman";
        age = 53;
    }

    public Human(String firstName, String lastName, int age) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }


}
