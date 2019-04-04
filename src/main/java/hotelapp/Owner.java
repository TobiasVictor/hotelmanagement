package hotelapp;

public class Owner extends Employee {


    public Owner(String name, String prename, int yearsOfExperience) {
        super(name, prename, yearsOfExperience);
        this.education=education;
        this.ownWealth=ownWealth;
        this.salary = salary;

    }
    private double ownWealth;
    private String salary;
    private String education;
}