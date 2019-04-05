package hotelapp;

public class Room {


    private int roomNumber;
    private int roomCapacity;
    private String roomOrientation;

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public String getRoomOrientation() {
        return roomOrientation;
    }

    public Room(int roomNumber, int roomCapacity, String roomOrientation) {
        this.roomNumber = roomNumber;
        this.roomCapacity = roomCapacity;
        this.roomOrientation = roomOrientation;
    }

}
