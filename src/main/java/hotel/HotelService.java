package hotel;

import client.CheckinData;
import client.Client;
import client.Rng;

import java.util.*;

public class HotelService {

    private HotelRepository hotelRepository;
    private final Map<Hotel, List<Client>> checkinList = new HashMap<>();

    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
        new Thread(() ->{
            int counter=10;
            while(counter>=0){
                synchronized (checkinList){

                    if(checkinList.size()>0){
                        counter=3;

                    } else{
                        counter--;
                    }
                    for(Map.Entry<Hotel,List<Client>> entry: checkinList.entrySet()){
                        System.out.println("statistics for hotel" + entry.getKey());
                        System.out.println("Persons for statistics" + Arrays.toString(entry.getValue().toArray()));
                    }

                }
                try{
                    Thread.sleep(5000);
                }catch (InterruptedException e){
                    break;
                }
            }
        }).start();


    }

    /**
     * Validate Hotel object and add it to the list.
     * @param hotel instance
     * @return value reprenting a status
     * @throws IllegalAccessException for giving no rating .
     */

    public String validateAndAddHotel(Hotel hotel) throws IllegalAccessException {



        String name = hotel.getName();
        int rating = hotel.getRating();

        if (name.equals("")) {
            throw new NullPointerException("Enter the hotel name again");
        }
        if (rating == 0) {
            throw new IllegalAccessException( "Enter the rating  again");
        }


        boolean responseFromRepo = hotelRepository.add(hotel);
        if (responseFromRepo) {
            return "Hotel added with succes ";
        }

        return "Revise hotel parameters";

    }

    public void validateAndDeleteHotel(Hotel hotel) {
        hotelRepository.remove(hotel);

    }

    public List<Hotel> getHotels() {
        return hotelRepository.listHotels();
    }

    public void checkIn(Client client, Hotel hotel){
                synchronized (checkinList){
                        try {
                            Thread.sleep(Rng.randomSlpTime()*500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("New client: " + client + "at:" + new CheckinData().getTimeAndDate());
                    if(!checkinList.containsKey(hotel)){
                        checkinList.put(hotel, new LinkedList<>());
                    }
                    checkinList.get(hotel).add(client);
                }

    }
    public Hotel getRandomHotel() {
        return getHotels().get(Rng.randomHotel(0,3));
    }
}
