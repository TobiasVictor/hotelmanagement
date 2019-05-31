package room;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.log4j.Logger;
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Room implements Comparable<Room>{

    private static final Logger Log = Logger.getLogger(Room.class);

    private String roomName;
    private int roomCapacity;
    private String roomOrientation;

    @Deprecated
    public Room(String roomName, String roomOrientation) {
        this.roomName = roomName;
        this.roomOrientation = roomOrientation;
    }


    public void roomPresentation() {
        Log.info("Our room is number : " + roomName + " is oriented in: " + roomOrientation + " and it has a capacity of :" + roomCapacity);
    }


    @Override
    public int compareTo(Room o) {
        if(getRoomName() == null || o.getRoomName()==null)
        {
            return  0 ;
        }
        return getRoomName().compareTo(o.getRoomName());
    }
}
