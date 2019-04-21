package hotel;

public class Room {


    private int roomNumber;
    private int roomCapacity;
    private String roomOrientation;

    public void setRoomParameters(int roomCapacity, String roomOrientation, int roomNumber) {
        this.roomCapacity = roomCapacity;
        this.roomOrientation = roomOrientation;
        this.roomNumber = roomNumber;


    }
    public Room(int roomNumber, String roomOrientation) {
        this.roomNumber = roomNumber;
        this.roomOrientation = roomOrientation;
    }



    public Room(int roomNumber, int roomCapacity, String roomOrientation) {
        this.roomNumber = roomNumber;
        this.roomCapacity = roomCapacity;
        this.roomOrientation = roomOrientation;
    }

    public void roomPresentation() {
        System.out.println("Our room is number : " + roomNumber + " is oriented in: " + roomOrientation + " and it has a capacity of :" + roomCapacity);
    }

    @Override
    public String toString() {
        return "room number :  " + roomNumber + " , room capacity is : " + roomCapacity + " , room orientation is : " + roomOrientation;

    }
}
