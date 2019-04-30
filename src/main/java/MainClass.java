import enums_hotel.HotelOpenTime;
import enums_hotel.HotelType;
import hotel.Address;
import hotel.Hotel;
import hotel.HotelRepository;
import hotel.HotelService;
import room.Room;

public class MainClass {

    public static void main(String[] args) {
        Address firstAddress = new Address("Bucuresti", 55, "Cluj-Napoca");
        Room firstRoom = new Room(55, 3, "Vest");
        final Hotel firstHotel = new Hotel(7, "La Ciortanu", firstAddress, firstRoom, HotelType.PITORESC, HotelOpenTime.OPEN_TIME_OUTSIDE_HOLIDAYS);
        Address secondAddress = new Address("Izlazului", 56, "Cluj-Napoca");
        Room secondRoom = new Room(52, 2, "Est");
        final Hotel secondHotel = new Hotel(2, "La Tinu", secondAddress, secondRoom, HotelType.LUXURY, HotelOpenTime.OPEN_TIME_ON_HOLIDAYS);


        HotelRepository hotelRepository = new HotelRepository();
        HotelService hotelService = new HotelService(hotelRepository);
        // add
        hotelService.validateAndAddHotel(firstHotel);
        hotelService.validateAndAddHotel(secondHotel);

        //delete
        hotelService.validateAndDeleteHotel(secondHotel);

        //list
        for (Hotel hotel : hotelService.getHotels()) {
            System.out.println(hotel.getName());
        }

        System.out.println(HotelType.valueOf("PITORESC"));

        System.out.println(HotelOpenTime.valueOf("OPEN_TIME_OUTSIDE_HOLIDAYS"));

        for (HotelOpenTime hotelOpenTime : HotelOpenTime.values()) {

            System.out.println("Hotel " + hotelOpenTime);
            System.out.println("String value defined : " + hotelOpenTime.getInterval());
            System.out.println("Int value defined : " + hotelOpenTime.getHoursNumber());
            System.out.println("Name to string : " + hotelOpenTime.name());
        }
    }
}

