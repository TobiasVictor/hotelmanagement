import enums_hotel.HotelOpenTime;
import enums_hotel.HotelType;
import hotel.Address;
import hotel.Hotel;
import hotel.HotelRepository;
import hotel.HotelService;
import org.apache.log4j.Logger;
import person.Human;
import room.Room;

import java.io.*;


public class MainClass {
    private static final Logger Log = Logger.getLogger(MainClass.class);

    public static void main(String[] args) throws IllegalAccessException, FileNotFoundException, HotelNameException {
        Address firstAddress = new Address("Bucuresti", 55, "Cluj-Napoca");
        Room firstRoom = new Room(55, 3, "Vest");
        final Hotel firstHotel = new Hotel(7, "La Ciortanu", firstAddress, firstRoom, HotelType.PICTURESQUE, HotelOpenTime.OPEN_TIME_OUTSIDE_HOLIDAYS);
        Address secondAddress = new Address("Izlazului", 56, "Cluj-Napoca");
        Room secondRoom = new Room(52, 2, "Est");
        Hotel f1 = new Hotel(1, "dior", firstAddress, firstRoom, HotelType.PICTURESQUE, HotelOpenTime.OPEN_TIME_OUTSIDE_HOLIDAYS);

        final Hotel secondHotel = new Hotel(2, "La Tinu", secondAddress, secondRoom, HotelType.LUXURY, HotelOpenTime.OPEN_TIME_ON_HOLIDAYS);
        Human human = new Human("Jihn", "Rin", 444);


        // deprecated constructor
        Room second = new Room(55, "Est");

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

        Log.info(HotelType.valueOf("PICTURESQUE"));

        Log.info(HotelOpenTime.valueOf("OPEN_TIME_OUTSIDE_HOLIDAYS"));

        for (HotelOpenTime hotelOpenTime : HotelOpenTime.values()) {

            Log.info("Hotel " + hotelOpenTime);
            Log.info("String value defined : " + hotelOpenTime.getInterval());
            Log.info("Int value defined : " + hotelOpenTime.getHoursNumber());
            Log.info("Name to string : " + hotelOpenTime.name());

        }

        try {
            Log.info("Try to insert a hotel");
            hotelService.validateAndAddHotel(f1);
        } catch (IllegalAccessException e) {

            Log.error("Exception thrown" + e);

        } catch (NullPointerException e) {

            throw new HotelNameException("Exception about name  thrown");

        }
        //bytesteams
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("in.txt");
            out = new FileOutputStream("out.txt");

            int val;

            while ((val = in.read()) != -1) {
                out.write(val);
            }
        } catch (IOException e) {
            e.printStackTrace();

        } finally {


            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }

            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        try (PrintWriter writer = new PrintWriter(new File("room.txt"))) {
            writer.println("Details of first room :  " + firstRoom);
        }


    }
}


