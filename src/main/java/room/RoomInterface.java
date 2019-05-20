package room;

import java.util.List;


public interface RoomInterface {
    /**
     * Add room
     * @param room instance
     * @return true is inserted
     */

    boolean add(Room room);

    void remove(Room room);

    List<Room> listRooms();
}
