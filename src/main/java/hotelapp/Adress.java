package hotelapp;

public class Adress {

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public String getCity() {
        return city;
    }

    private   String street ;
    private   int number;
    private  String city;

    public Adress(String street, int number, String city) {
        this.street = street;
        this.number = number;
        this.city = city;
    }



}
