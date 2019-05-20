package room;


import java.util.List;

public class RoomService {
    private RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    /**
     * Validate  Room object and add it to the list.
     * @param room instance
     * @return value representing a status
     */
    public String validateAndAddRoom(Room room) {
        //some exceptions going on
        boolean responseFromRepo = roomRepository.add(room);
        if (responseFromRepo) {
            return "Room added with succes ";
        }
        return "Revise Room parameters ";

    }


    public void validateAndDeleteRoom(Room room) {
        roomRepository.remove(room);

    }

    public List<Room> getRooms() {
        return roomRepository.listRooms();
    }

}
