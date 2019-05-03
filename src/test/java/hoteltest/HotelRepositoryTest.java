package hoteltest;

import enums_hotel.HotelOpenTime;
import enums_hotel.HotelType;
import hotel.Address;
import hotel.Hotel;
import hotel.HotelRepository;
import org.junit.Before;
import org.junit.Test;
import room.Room;

import java.util.List;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.doNothing;

public class HotelRepositoryTest {
    private HotelRepository hotelRepository;

    @Before
    public  void setup(){
        hotelRepository = new HotelRepository();
    }
    @Test
    public void should_AddHotel_ForValidData(){
        //GIVEN

        Address address = new Address("1 dec ",6,"Cluj");
        Room room = new Room(6,3,"Est");
        Hotel hotel = new Hotel(5,"Tinut",address,room, HotelType.PITORESC, HotelOpenTime.OPEN_TIME_ON_HOLIDAYS);

        //WHEN
        boolean response = hotelRepository.add(hotel);


        //THEN
        assertTrue(response);
    }
    @Test
    public void should_Not_AddHotel_ForValidData(){
        //GIVEN

        Address address = new Address("1 dec ",6,"Cluj");
        Room room = new Room(6,3,"Est");
        Hotel hotel = new Hotel(5,"Tinut",address,room, HotelType.PITORESC, HotelOpenTime.OPEN_TIME_ON_HOLIDAYS);

        //WHEN
        boolean response = hotelRepository.add(hotel);


        //THEN
        assertFalse(response);
    }
   @Test
    public void  should_Remove(){


        doNothing();
   }



}
