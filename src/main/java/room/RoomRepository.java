package room;

import java.util.ArrayList;
import java.util.List;

public class RoomRepository implements RoomInterface {
    private List<Room> rooms = new ArrayList<>();

    /**
     *{@inheritDoc}
     */
    @Override
    public boolean add(Room room) {
        rooms.add(room);

        return true;
    }

    @Override
    public void remove(Room room) {
        rooms.remove(room);
    }

    @Override
    public List<Room> listRooms() {
        return rooms;
    }
}
