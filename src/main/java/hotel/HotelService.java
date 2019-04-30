package hotel;

import java.util.List;

public class HotelService {

    private HotelRepository hotelRepository;

    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;

    }

    public String validateAndAddHotel(Hotel hotel) {
        String name = hotel.getName();
        int rating = hotel.getRating();
        if (name.equals("")) {
            return "Enter the hotel name again";
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

    public void validateAndDeleteHotel(Hotel hotel) {
        hotelRepository.remove(hotel);

    }

    public List<Hotel> getHotels() {
        return hotelRepository.listHotels();
    }
}
