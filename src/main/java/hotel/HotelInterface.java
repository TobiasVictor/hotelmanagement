package hotel;

import java.util.List;

public interface HotelInterface {

    boolean add(Hotel hotel);

    void remove(Hotel hotel);

    List<Hotel> listHotels();
}
