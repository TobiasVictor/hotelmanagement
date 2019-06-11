package hotel;

import client.CheckinData;
import enums_hotel.HotelOpenTime;
import enums_hotel.HotelType;
import lombok.*;
import room.Room;

import java.util.Queue;


@Getter
@Setter
@ToString
public class Hotel  {

    private int rating;
    private String name;
    private Address address;
    private Room room;
    private HotelType hotelType;
    private HotelOpenTime hotelOpenTime;
    private long id;
    private Queue<CheckinData> queue;
public Hotel(int rating, String name, Address address, Room room, HotelType hotelType, HotelOpenTime hotelOpenTime,Queue queue){
      this.rating = rating;
      this.hotelOpenTime = hotelOpenTime;
      this.room=room;
      this.queue=queue;
      this.name=name;
      this.address=address;
      this.hotelType=hotelType;


}
    public Hotel(int rating, String name, Address address, Room room, HotelType hotelType, HotelOpenTime hotelOpenTime,long id){
        this.rating = rating;
        this.hotelOpenTime = hotelOpenTime;
        this.room=room;
        this.name=name;
        this.address=address;
        this.hotelType=hotelType;
        this.id=id;

    }





}
