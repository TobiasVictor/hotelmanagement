package hotelspecialroomstest;

import hotelspecialrooms.ConferenceSpecialRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    private ConferenceSpecialRoom cRoom;

    @Before
    void setup() {
        cRoom = new ConferenceSpecialRoom();

    }

    @Test
    public void should_ShowInfoAboutTheOpeningTimeOnMonday() {
        //GIVEN
        int number = 1;
        //WHEN
        String response = cRoom.openingTime(number);
        //THEN
        assertEquals("Sedinta are loc de la 8 AM la 9 AM", response);

    }

    public void should_ShowInfoAboutTheOpeningTimeExceptMonday() {
        //GIVEN
        int number = 3;
        //WHEN
        String response = cRoom.openingTime(number);
        //THEN
        assertEquals("Programul depinde de rezervare", response);

    }


}
