package hotel;

import enums_hotel.HotelOpenTime;
import enums_hotel.HotelType;
import lombok.*;
import room.Room;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Hotel  {

    private int rating;
    public static final int HOTEL_CAPACITY = 200;
    private String name;
    private Address address;
    private Room room;
    private HotelType hotelType;
    private HotelOpenTime hotelOpenTime;
    private long id;

}
