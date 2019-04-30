package room;

import java.util.List;

public interface RoomInterface {

    boolean add(Room room);

    void remove(Room room);

    List<Room> listRooms();
}
