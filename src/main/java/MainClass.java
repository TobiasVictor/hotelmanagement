import enums_hotel.HotelOpenTime;
import enums_hotel.HotelType;
import hotel.Address;
import hotel.Hotel;
import hotel.HotelRepository;
import hotel.HotelService;
import org.apache.log4j.Logger;
import person.Human;
import room.Room;


public class MainClass {
    private static final Logger Log = Logger.getLogger(MainClass.class);

    public static void main(String[] args) throws IllegalAccessException {
        Address firstAddress = new Address("Bucuresti", 55, "Cluj-Napoca");
        Room firstRoom = new Room(55, 3, "Vest");
        final Hotel firstHotel = new Hotel(7, "La Ciortanu", firstAddress, firstRoom, HotelType.PITORESC, HotelOpenTime.OPEN_TIME_OUTSIDE_HOLIDAYS);
        Address secondAddress = new Address("Izlazului", 56, "Cluj-Napoca");
        Room secondRoom = new Room(52, 2, "Est");
        final Hotel secondHotel = new Hotel(0, "La Tinu", secondAddress, secondRoom, HotelType.LUXURY, HotelOpenTime.OPEN_TIME_ON_HOLIDAYS);
        Human human = new Human("Jihn", "Rin", 444);

        Log.info(human);
        try {

        } catch ()



        // deprecated constructor
        Room second = new Room(55,"Est");

        HotelRepository hotelRepository = new HotelRepository();
        HotelService hotelService = new HotelService(hotelRepository);
        // add
        hotelService.validateAndAddHotel(firstHotel);
        hotelService.validateAndAddHotel(secondHotel);

        //delete
        hotelService.validateAndDeleteHotel(secondHotel);

        //list
        for (Hotel hotel : hotelService.getHotels()) {
            Log.error(hotel.getName());
        }

        Log.info(HotelType.valueOf("PITORESC"));

        Log.info(HotelOpenTime.valueOf("OPEN_TIME_OUTSIDE_HOLIDAYS"));

        for (HotelOpenTime hotelOpenTime : HotelOpenTime.values()) {

            Log.info("Hotel " + hotelOpenTime);
            Log.info("String value defined : " + hotelOpenTime.getInterval());
            Log.info("Int value defined : " + hotelOpenTime.getHoursNumber());
            Log.info("Name to string : " + hotelOpenTime.name());

        }
    }
}


