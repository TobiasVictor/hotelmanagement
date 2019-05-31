package hoteltest;

import enums_hotel.HotelOpenTime;
import enums_hotel.HotelType;
import hotel.Address;
import hotel.Hotel;
import hotel.HotelRepository;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.IsCollectionContaining;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import room.Room;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.doNothing;
import static org.junit.Assert.*;

public class HotelRepositoryTest {
    private HotelRepository hotelRepository;

    @Before
    public void setup() {
        hotelRepository = new HotelRepository();
    }

    @Test
    public void should_AddHotel_ForValidData() {
        //GIVEN

        Address address = new Address("1 dec ", 6, "Cluj");
        Room room = new Room("Poc", 3, "Est");
        Hotel hotel = new Hotel(5, "Tinut", address, room, HotelType.PICTURESQUE, HotelOpenTime.OPEN_TIME_ON_HOLIDAYS,434);

        //WHEN
        boolean response = hotelRepository.add(hotel);


        //THEN
        assertTrue(response);
    }

    @Test
    public void should_Not_AddHotel_ForValidData() {
        //GIVEN

        Address address = new Address("1 dec ", 6, "Cluj");
        Room room = new Room("Room", 3, "Est");
        Hotel hotel = new Hotel(5, "Tinut", address, room, HotelType.PICTURESQUE, HotelOpenTime.OPEN_TIME_ON_HOLIDAYS,567);

        //WHEN
        boolean response = hotelRepository.add(hotel);


        //THEN
        assertFalse(response);
    }

    @Test
    @Disabled("Not implemented very good ")
    public void should_Remove() {


        doNothing();
    }

    @Test
    public void should_CheckList() {
        //GIVEN
        Address address = new Address("1 dec ", 6, "Cluj");
        Room room = new Room("Lavanda", 3, "Est");
        Hotel hotel = new Hotel(5, "Tinut", address, room, HotelType.PICTURESQUE, HotelOpenTime.OPEN_TIME_ON_HOLIDAYS,20);
        Address address1 = new Address("1 decc ", 7, "Clujj");
        Room room1 = new Room("Ionetul", 5, "Vest");
        Hotel hotel1 = new Hotel(2, "Tinut1", address1, room1, HotelType.PICTURESQUE, HotelOpenTime.OPEN_TIME_ON_HOLIDAYS,454);
        //When
        List<Hotel> hotels = Arrays.asList(hotel, hotel1);
        //Then
        MatcherAssert.assertThat(hotels, IsCollectionContaining.hasItems(hotel));


    }



}
