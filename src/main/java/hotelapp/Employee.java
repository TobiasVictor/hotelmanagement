package hotelapp;

public class Employee {
    private String name;
    private String prename;
    private int yearsOfExperience;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    public Employee(String name,String prename, int yearsOfExperience){
        this.name=name;
        this.prename=prename;
        this.yearsOfExperience=yearsOfExperience;
    }
}
