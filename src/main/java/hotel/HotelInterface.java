package hotel;

import java.util.List;

public interface HotelInterface {
    /**
     * Add hotel.
     *
     * @param hotel instance
     * @return  true is inserted
     */

    boolean add(Hotel hotel);

    void remove(Hotel hotel);

    List<Hotel> listHotels();
}
