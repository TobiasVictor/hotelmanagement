package hotel;

public class Address {

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public String getCity() {
        return city;
    }

    private String street;
    private int number;
    private String city;

    public Address(String street, int number, String city) {
        this.street = street;
        this.number = number;
        this.city = city;
    }

    @Override
    public String toString() {
        return "the city where the hotel belongs" + city + ", hotel street is " + street + " , street number is :  " + number;
    }
}
