package hotel;

import java.util.List;

public class HotelService {

    private HotelRepository hotelRepository;

    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;

    }

    public String validateAndAdd(Hotel hotel) {
        String name = hotel.getName();
        int rating = hotel.getRating();
        if (name.equals("")) {
            return "Enter the hotel name again";    //how can i validateAndAdd hotel and address in the same time? ( adress is created via composition)
        }
        if (rating == 0) {
            return "Enter the rating  again";
        }

        boolean responseFromRepo = hotelRepository.add(hotel);
        if (responseFromRepo) {
            return "Hotel added with succes ";
        }

        return "Revise hotel parameters";

    }

    public void validateAndDelete(Hotel hotel) {
        hotelRepository.remove(hotel); // how can i check the size of my list in this function?

    }
    public List<Hotel> getHotels(){
        return hotelRepository.listHotels();
    }
}
