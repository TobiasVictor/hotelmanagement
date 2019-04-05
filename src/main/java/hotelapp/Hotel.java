package hotelapp;

public class Hotel {
    private int rating;
    private final int hotelCapacity;
    private String hotelName;
    private Adress theAdress;
    private Room theRoom;

    public Hotel(int rating, int hotelCapacity, String hotelName, Adress theAdress, Room theRoom) {
        this.rating = rating;
        this.hotelCapacity = hotelCapacity;
        this.hotelName = hotelName;
        this.theAdress = theAdress;
        this.theRoom = theRoom;
    }

    public int getRating() {
        return rating;
    }

    public int getHotelCapacity() {
        return hotelCapacity;
    }

    public String getHotelName() {
        return hotelName;
    }

    public Adress getTheAdress() {
        return theAdress;
    }

    public Room getTheRoom() {
        return theRoom;
    }
}
