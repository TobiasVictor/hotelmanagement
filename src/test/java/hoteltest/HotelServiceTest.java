package hoteltest;

import enums_hotel.HotelOpenTime;
import enums_hotel.HotelType;
import hotel.Address;
import hotel.Hotel;
import hotel.HotelRepository;
import hotel.HotelService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import room.Room;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class HotelServiceTest {

    @Mock
    private HotelRepository hotelRepository;

    private HotelService hotelService;

    @BeforeEach
    void setup() {
        hotelService = new HotelService(hotelRepository);
    }

    @Test
    void should_ValidateAndAddHotel_ForValidData() throws IllegalAccessException {
        // GIVEN

        Address address = new Address("1 dec ", 6, "Cluj");
        Room room = new Room("Milion", 3, "Est");
        Hotel hotel = new Hotel(5, "Tinut", address, room, HotelType.PICTURESQUE, HotelOpenTime.OPEN_TIME_ON_HOLIDAYS,900);
        doReturn(false).when(hotelRepository).add(any(Hotel.class));

        //WHEN
        String response = hotelService.validateAndAddHotel(hotel);

        //THEN
        assertEquals("Revise hotel parameters", response);


    }

    @Test
    void shouldVerify_HowManyTimeWeUsedAdd() {
        Address address = new Address("1 dec ", 6, "Cluj");
        Room room = new Room("TUTU", 3, "Est");
        Hotel hotel = new Hotel(5, "Tinut", address, room, HotelType.PICTURESQUE, HotelOpenTime.OPEN_TIME_ON_HOLIDAYS,988);
        HotelRepository hotelRepository = Mockito.mock(HotelRepository.class);
        HotelService hotelService = new HotelService(hotelRepository);
        verify(hotelRepository, Mockito.times(5)).add(hotel);


    }

    @Test
    public void shouldVerify_IfStreetFromAdress_IsNull() {
        //GIVEN
        Address address = new Address(null, 5, "Cluj");
        //WHEN
        //THEN
        assertNotNull(address.getStreet());
    }

    @Disabled
    @Test
    public void shouldDoSmth() {
        //GIVEN
        Address address = new Address("1 dec ", 6, "Cluj");
        Room room = new Room("Apache", 3, "Est");
        Hotel hotel = new Hotel(0, "Tinut", address, room, HotelType.PICTURESQUE, HotelOpenTime.OPEN_TIME_ON_HOLIDAYS,545);
        //Then
        List<Hotel> hotels = Arrays.asList(hotel);

//        doThrow()
    }


}
