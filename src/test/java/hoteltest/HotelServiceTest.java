package hoteltest;

import enums_hotel.HotelOpenTime;
import enums_hotel.HotelType;
import hotel.Address;
import hotel.Hotel;
import hotel.HotelRepository;
import hotel.HotelService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import room.Room;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class HotelServiceTest {

    @Mock
    private HotelRepository hotelRepository;

    private HotelService  hotelService;

    @Before
    public  void setup(){
        hotelService = new HotelService(hotelRepository);
    }

    @Test
    public  void should_ValidateAndAddHotel_ForValidData() throws IllegalAccessException {
        // GIVEN

        Address address = new Address("1 dec ",6,"Cluj");
        Room room = new Room(6,3,"Est");
        Hotel hotel = new Hotel(5,"Tinut",address,room, HotelType.PICTURESQUE, HotelOpenTime.OPEN_TIME_ON_HOLIDAYS);
        doReturn(false).when(hotelRepository).add(any(Hotel.class));

        //WHEN
        String response = hotelService.validateAndAddHotel(hotel);

        //THEN
        assertEquals("Revise hotel parameters",response);


}

@Test
    public void  shouldVerify_HowManyTimeWeUsedAdd(){
    Address address = new Address("1 dec ",6,"Cluj");
    Room room = new Room(6,3,"Est");
    Hotel hotel = new Hotel(5,"Tinut",address,room, HotelType.PICTURESQUE, HotelOpenTime.OPEN_TIME_ON_HOLIDAYS);
        HotelRepository hotelRepository = Mockito.mock(HotelRepository.class);
        HotelService hotelService = new HotelService(hotelRepository);
        verify(hotelRepository,Mockito.times(5)).add(hotel);



    }

    @Test
    public void shouldVerify_IfStreetFromAdress_IsNull(){
        //GIVEN
        Address address = new Address(null,5,"Cluj");
        //WHEN
        //THEN
        assertNotNull(address.getStreet());
    }

    @Test(expected = IllegalAccessException.class)
    public void shouldDoSmth(){
        //GIVEN
        Address address = new Address("1 dec ",6,"Cluj");
        Room room = new Room(6,3,"Est");
        Hotel hotel = new Hotel(0,"Tinut",address,room, HotelType.PICTURESQUE, HotelOpenTime.OPEN_TIME_ON_HOLIDAYS);
        //Then
        List<Hotel> hotels = Arrays.asList(hotel);
    }









}
