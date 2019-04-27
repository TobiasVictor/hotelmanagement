package hotel;

public class MainClass {

    public static void main(String[] args) {
        Address firstAddress = new Address("Bucuresti",55,"Cluj-Napoca");
        Room firstRoom = new Room(55,3,"Vest");
        final Hotel firstHotel = new Hotel(7,"La Ciortanu",firstAddress,firstRoom);
        Address secondAddress = new Address("Izlazului",56,"Cluj-Napoca");
        Room secondRoom = new Room(52,2,"Est");
        final Hotel secondHotel = new Hotel(2,"La Tinu",secondAddress,secondRoom);



        HotelRepository hotelRepository = new HotelRepository();
        HotelService hotelService = new HotelService(hotelRepository);
        // add
        hotelService.validateAndAdd(firstHotel);
        hotelService.validateAndAdd(secondHotel);

        //delete
        hotelService.validateAndDelete(secondHotel);

        //list
        for(Hotel hotel : hotelService.getHotels()){
            System.out.println(hotel.getName());  //should i make a combined getter for name and rating?
        }


    }
}

