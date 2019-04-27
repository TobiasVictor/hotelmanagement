package hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelRepository implements HotelInterface{
    private List<Hotel> hotels = new ArrayList<>();
    @Override
    public boolean add(Hotel hotel) {
        hotels.add(hotel);

        return true;
    }


    @Override
    public void remove(Hotel hotel) {
        hotels.remove(hotel);
    }

    @Override
    public List<Hotel> listHotels() {
        return hotels;
    }
}
