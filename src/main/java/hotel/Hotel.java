package hotel;

import enums_hotel.HotelOpenTime;
import enums_hotel.HotelType;
import org.apache.log4j.Logger;
import room.Room;

public class Hotel {
    public int getRating() {
        return rating;
    }

    private int rating;
    public static final int HOTEL_CAPACITY = 200;
    private String name;
    private Address address;
    private Room room;
    private HotelType hotelType;
    private HotelOpenTime hotelOpenTime;

    public String getName() {
        return name;
    }

    public Hotel(int rating, String name, Address address, Room room, HotelType hotelType, HotelOpenTime hotelOpenTime) {
        this.rating = rating;
        this.name = name;
        this.address = address;
        this.room = room;
        this.hotelType = hotelType;
        this.hotelOpenTime = hotelOpenTime;
    }


    @Override
    public String toString() {
        return "hotel name : " + name + " , rating : " + rating + " " + " , hotel capacity " + HOTEL_CAPACITY + " , room of hotel:  " + room + " , adress of hotel : " + address;
    }

}
