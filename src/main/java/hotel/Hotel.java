package hotel;

public class Hotel {
    private int rating;
    public static final int HOTELCAPACITY = 200;
    private String name;
    private Address address;
    private Room room;

    public Hotel(int rating, String name, Address address, Room room) {
        this.rating = rating;
        this.name = name;
        this.address = address;
        this.room = room;
    }


    @Override
    public String toString() {
        return "hotel name : " + name + " , rating : " + rating + " " + " , hotel capacity " + HOTELCAPACITY + " , room of hotel:  " + room + " , adress of hotel : " + address;
    }

}
