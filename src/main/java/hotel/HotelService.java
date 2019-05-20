package hotel;

import java.util.List;

public class HotelService {

    private HotelRepository hotelRepository;

    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;

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
}
