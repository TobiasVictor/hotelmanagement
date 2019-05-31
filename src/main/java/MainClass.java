import client.Client;
import employee.Employee;
import enums_hotel.HotelOpenTime;
import enums_hotel.HotelType;
import hotel.*;
import org.apache.log4j.Logger;
import person.Human;
import room.Room;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class MainClass  {
    private static final Logger Log = Logger.getLogger(MainClass.class);

    public static void main(String[] args) throws IllegalAccessException, FileNotFoundException, HotelNameException {
        Address firstAddress = new Address("Bucuresti", 55, "Cluj-Napoca");
        Room firstRoom = new Room("One Million", 3, "Vest");
        final Hotel firstHotel = new Hotel(7, "La Ciortanu", firstAddress, firstRoom, HotelType.PICTURESQUE, HotelOpenTime.OPEN_TIME_OUTSIDE_HOLIDAYS,421);
        Address secondAddress = new Address("Izlazului", 56, "Cluj-Napoca");
        Room secondRoom = new Room("DIor", 2, "Est");
        Hotel f1 = new Hotel(1, "dior", firstAddress, firstRoom, HotelType.PICTURESQUE, HotelOpenTime.OPEN_TIME_OUTSIDE_HOLIDAYS,132);

        final Hotel secondHotel = new Hotel(2, "La Tinu", secondAddress, secondRoom, HotelType.LUXURY, HotelOpenTime.OPEN_TIME_ON_HOLIDAYS,121);
        Human human = new Human("Jihn", "Rin", 444,199032341);


        // deprecated constructor
        Room second = new Room("Atlantic", "Est");

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

        roomsList();
        clientSet();
        roomMap();

        List <? super Human> testsuper = new ArrayList<>();
        testsuper.add(new Human());
        testsuper.add(new Employee());
        Log.info(testsuper);







    }

    private static void roomsList() {
        //creating rooms for list
        Room roomno1 = new Room("One Million", 3, "Est");
        Room roomno2 = new Room("Two Million", 4, "Vest");
        Room roomno3 = new Room("Three Million", 2, "North");
        Room roomno4 = new Room("Four Million", 3, "Vest");
        Room roomno5 = new Room("Five Million", 1, "Vest");
        Room roomno6 = new Room("Six Million", 3, "West");
        Room roomno7 = new Room("Seven Million", 4, "Vest");
        Room roomno8 = new Room("Eight Million", 7, "South");
        Room roomno9 = new Room("Nine Million", 8, "Vest");
        Room roomno10 = new Room("Ten Million", 3, "Vest");
        // creating the list
        List<Room> listRooms = new ArrayList<>();
        //adding the rooms
        listRooms.add(roomno1);
        listRooms.add(roomno2);
        listRooms.add(roomno3);
        listRooms.add(roomno4);
        listRooms.add(roomno5);
        listRooms.add(roomno6);
        listRooms.add(roomno7);
        listRooms.add(roomno8);
        listRooms.add(roomno9);
        listRooms.add(roomno10);

       // for (Room room : listRooms){
        //    Log.info(room.getRoomName()+" " + " " + room.getRoomCapacity()+" " +" "+ room.getRoomOrientation());
        //}

        List<Room> sortedRooms = listRooms.stream()
                .sorted(Comparator.comparing(Room::getRoomName))
                .collect(Collectors.toList());

        for (Room room : sortedRooms){
            Log.info(room.getRoomName()+" " + " " + room.getRoomCapacity()+" " +" "+ room.getRoomOrientation());
        }
        //sortedRooms.size();
    }
    private static void clientSet(){
            //creating clients for set
        Client client1 = new Client("gigi","tinu",22,1990321234,55,"20 mai 1990","22 mai 1990");
        Client client2 = new Client("gigi","tinu",22,1990321244,55,"20 mai 1990","22 mai 1990");
        Client client3 = new Client("gigi","tinu",22,1990321254,55,"20 mai 1990","22 mai 1990");
        Client client4 = new Client("gigi","tinu",22,1990321264,55,"20 mai 1990","22 mai 1990");
        Client client5 = new Client("gigi","tinu",22,1990321274,55,"20 mai 1990","22 mai 1990");
        Client client6 = new Client("gigi","tinu",22,1990321284,55,"20 mai 1990","22 mai 1990");
        Client client7 = new Client("gigi","tinu",22,1990321294,55,"20 mai 1990","22 mai 1990");
        Client client8 = new Client("gigi","tinu",22,1990321231,55,"20 mai 1990","22 mai 1990");
        Client client9 = new Client("gigi","tinu",22,1990321224,55,"20 mai 1990","22 mai 1990");
        Client client10 = new Client("gigi","tinu",22,1990342123,55,"20 mai 1990","22 mai 1990");
        Client client11 = new Client("gigi","tinu",22,1990351234,55,"20 mai 1990","22 mai 1990");
        Client client12 = new Client("gigi","tinu",22,1990371234,55,"20 mai 1990","22 mai 1990");
        Client client13 = new Client("gigi","tinu",22,1930321234,55,"20 mai 1990","22 mai 1990");
        Client client14 = new Client("gigi","tinu",22,1940321234,55,"20 mai 1990","22 mai 1990");
        Client client15 = new Client("gigi","tinu",22,1950321234,55,"20 mai 1990","22 mai 1990");
        Client client16 = new Client("gigi","tinu",22,1960321234,55,"20 mai 1990","22 mai 1990");
        Client client17 = new Client("gigi","tinu",22,1970321234,55,"20 mai 1990","22 mai 1990");
        Client client18 = new Client("gigi","tinu",22,1996321234,55,"20 mai 1990","22 mai 1990");
        Client client19 = new Client("gigi","tinu",22,1996321234,55,"20 mai 1990","22 mai 1990");
        Client client20 = new Client("gigi","tinu",22,1996321234,55,"20 mai 1990","22 mai 1990");

        Set<Client> clientSet = new HashSet<>();


        clientSet.add(client1);
        clientSet.add(client2);
        clientSet.add(client3);
        clientSet.add(client4);
        clientSet.add(client5);
        clientSet.add(client6);
        clientSet.add(client7);
        clientSet.add(client8);
        clientSet.add(client9);
        clientSet.add(client10);
        clientSet.add(client11);
        clientSet.add(client12);
        clientSet.add(client13);
        clientSet.add(client14);
        clientSet.add(client15);
        clientSet.add(client16);
        clientSet.add(client17);
        clientSet.add(client18);
        clientSet.add(client19);
        clientSet.add(client20);
        for (Client client : clientSet){
            Log.info(client.getFirstName()+ " "+client.getLastName()+" "+ client.getAge()+" "+client.getCnp()+" "+client.getClientCode()+" "+client.getEntryDate()+" "+ client.getExitDate());
        }
    }
    private static void roomMap(){
        Address secondAddress = new Address("Izlazului", 56, "Cluj-Napoca");
        Address thirdAddress = new Address("Plopului", 65, "Cluj-Napoca");
        Address firstAddress = new Address("Carnatului", 562, "Cluj-Napoca");
        Room roomno1 = new Room("First", 5, "North");
        Room roomno2 = new Room("Sec", 3, "Est");
        Room roomno3 = new Room("Third", 2, "South");

        Hotel hotel1 = new Hotel(5,"Palazzio",firstAddress,roomno1,HotelType.PICTURESQUE,HotelOpenTime.OPEN_TIME_ON_HOLIDAYS,560);
        Hotel hotel2 = new Hotel(3,"Palazzio1",secondAddress,roomno2,HotelType.PICTURESQUE,HotelOpenTime.OPEN_TIME_ON_HOLIDAYS,561);
        Hotel hotel3 = new Hotel(7,"Palazzio3",thirdAddress,roomno3,HotelType.PICTURESQUE,HotelOpenTime.OPEN_TIME_ON_HOLIDAYS,562);

        // first list

        List<Room> list1 = new ArrayList<>();
        list1.add(roomno1);
        List<Room> list2 = new ArrayList<>();
        list2.add(roomno2);
        List<Room> list3 = new ArrayList<>();
        list3.add(roomno3);


        Map<Long,List<Room>> roomMap= new HashMap<>();

        roomMap.put(hotel1.getId(),list1);
        roomMap.put(hotel2.getId(),list2);
        roomMap.put(hotel3.getId(),list3);
        for (Map.Entry<Long,List<Room>>entry: roomMap.entrySet()){
            Log.info( entry.getKey() + " : " + entry.getValue());
        }


    }



}


