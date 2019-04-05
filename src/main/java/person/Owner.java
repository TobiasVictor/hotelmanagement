package person;


public class Owner extends Human {



    private double ownWealth;
    private int salary;
    private String education;

    public Owner(String firstName, String lastName, int age, double ownWealth, int salary, String education ) {
        super(firstName, lastName, age);
        this.education= education;
        this.ownWealth=ownWealth;
        this.salary=salary;

    }
}