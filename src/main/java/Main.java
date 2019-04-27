import hotel.Address;
import hotel.Hotel;
import hotel.Room;
import hotelspecialrooms.ConferenceRoom;
import hotelspecialrooms.GameRoom;
import hotelspecialrooms.RoomInterface;
import hotelspecialrooms.Pool;
import org.apache.log4j.Logger;
import person.Employee;
import java.io.*;
import java.util.List;

public class Main {

    private static Logger logger = Logger.getLogger("Main");

    public static void main(String[] args) {


        logger.info("start main");


        Address address = new Address("Mehedinti", 176, "Cluj-Napoca");

        Room room = new Room(59, 2, "Vest");

        Hotel hotel = new Hotel(5, "LaTobias", address, room);
        System.out.println(hotel);

        Room pentHouse = new Room(34, 7, "Est");
        Room ordinaryRoom = new Room(35, "Est");
        Room luxuryRoom = new Room(66, 2, "North");
        Room ordinaryRoom2 = new Room(10, "Vest");
        Room[] rooms = new Room[5];

        rooms[0] = room;
        rooms[1] = pentHouse;
        rooms[2] = ordinaryRoom;
        rooms[3] = luxuryRoom;
        rooms[4] = ordinaryRoom2;

        ordinaryRoom.roomPresentation();

        rooms[2].setRoomParameters(6, "Est", 22);

        ordinaryRoom.roomPresentation();

        pentHouse.roomPresentation();

        rooms[3].roomPresentation();


        RoomInterface game = new GameRoom();


        RoomInterface conference = new ConferenceRoom();
        RoomInterface pool = new Pool();
/*
        pool.openingTime();

        pool.numberOfWorkersForThisRoom(3);

        pool.numberOfReservations(2);
        //default constructor
        Employee empobj = new Employee();
        System.out.println("Employee  first name is : " + empobj.getFirstName());

        System.out.println("Employee  last name is  : " + empobj.getLastName());

        System.out.println("Employee age is : " + empobj.getAge());

        System.out.println("Employee job is : " + empobj.getJobPosition());

        System.out.println("Employee id job  is : " + empobj.getJobId());

        System.out.println("Employee salary is : " + empobj.getEmployeeSalary());


        //parametre constructor

        Employee empobj2 = new Employee("Lita", "Johnson", 30, 900, "Waitress", 666);

        System.out.println("Employee  first name is : " + empobj2.getFirstName());

        System.out.println("Employee  last name is  : " + empobj2.getLastName());

        System.out.println("Employee age is : " + empobj2.getAge());

        System.out.println("Employee job is : " + empobj2.getJobPosition());

        System.out.println("Employee id job  is : " + empobj2.getJobId());

        System.out.println("Employee salary is : " + empobj2.getEmployeeSalary());

        //Array List going on
        List<Client> clientList = new ArrayList();
        Client client1 = new Client();
        Client client2 = new Client("Gicu", "Ionut", 56, 234, "10.03.2018", "19.03.2018");
        Client client3 = new Client();

        clientList.add(client1);

        clientList.add(client2);

        clientList.add(client3);
        // some functions to test our list
        System.out.println("numarul de clienti este de: " + clientList.size());

        System.out.println("Clientul " + client2.getFirstName() + " " + client2.getLastName() + " are varsta de : " + client2.getAge() + " de ani ");

        clientList.remove(0);

        System.out.println("numarul de clienti este de: " + clientList.size());

        // Showing our constant

        System.out.println("capacitatea hotelului este de : " + hotel.HOTEL_CAPACITY);


    }
}

*/
    }
}