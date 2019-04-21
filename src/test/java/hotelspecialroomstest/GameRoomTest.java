package hotelspecialroomstest;
import hotelspecialrooms.GameRoom;
import org.junit.Before;
import org.junit.Test;
import static  org.junit.Assert.assertEquals;
public class GameRoomTest {
    private GameRoom gRoom;
    @Before
    public void setup(){
        gRoom= new GameRoom();
    }
    @Test
    public void should_ReturnInfoForMonday(){
        //GIVEN
        int numberOfDay=1;
        //WHEN
        String response1 = gRoom.openingTime(numberOfDay);
        //THEN
        assertEquals("Camera de jocuri este deschisa luni de la 6 PM pana la 8 AM",response1);
    }
    @Test
    public void should_ReturnInfoForTuesday(){
        //GIVEN
        int numberOfDay=2;
        //WHEN
        String response1 = gRoom.openingTime(numberOfDay);
        //THEN
        assertEquals("Camera de jocuri este deschisa marti de la 6 PM pana la 8 AM",response1);
    }
    @Test
    public void should_ReturnInfoForWednesday(){
        //GIVEN
        int numberOfDay=3;
        //WHEN
        String response1 = gRoom.openingTime(numberOfDay);
        //THEN
        assertEquals("Camera de jocuri este deschisa miercuri de la 6 PM pana la 8 AM",response1);
    }
    @Test
    public void should_ReturnInfoForThursday(){
        //GIVEN
        int numberOfDay=4;
        //WHEN
        String response1 = gRoom.openingTime(numberOfDay);
        //THEN
        assertEquals("Camera de jocuri este deschisa joi de la 6 PM pana la 8 AM",response1);
    }
    @Test
    public void should_ReturnInfoForFriday(){
        //GIVEN
        int numberOfDay=5;
        //WHEN
        String response1 = gRoom.openingTime(numberOfDay);
        //THEN
        assertEquals("Camera de jocuri este deschisa vineri de la 6 PM pana la 8 AM",response1);
    }
    @Test
    public void should_ReturnInfoForWeekend(){
        //GIVEN
        int numberOfDay=10;
        //WHEN
        String response1 = gRoom.openingTime(numberOfDay);
        //THEN
        assertEquals("Camera de jocuri este inchisa ",response1);
    }




    @Test
    public void should_LetKidsWith12OrMoreYearsIn(){
        //GIVEN
        int number=13;

        //WHEN
        String response2 =  gRoom.ageRestrict(number);

        //THEN
        assertEquals("Admis",response2);


    }
    @Test
    public void should_not_LetKidsWithLessThan12Years(){
        //GIVEN
        int number=9;

        //WHEN
        String response =  gRoom.ageRestrict(number);

        //THEN
        assertEquals("Respins",response);


    }
    @Test
    public void should_ShowLunchBreakForMonday(){
        //GIVEN
        int number=1;
        //WHEN
        String response = gRoom.workersRestTime(number);
        //THEN
        assertEquals("Luni pauza de masa are loc de la 4 PM la 5 PM",response);


    }
    @Test
    public void should_ShowLunchBreakForTuesday(){
        //GIVEN
        int number=2;
        //WHEN
        String response = gRoom.workersRestTime(number);
        //THEN
        assertEquals("Marti pauza de masa are loc de la 4 PM la 5 PM",response);


    }
    @Test
    public void should_ShowLunchBreakForWednesday(){
        //GIVEN
        int number=3;
        //WHEN
        String response = gRoom.workersRestTime(number);
        //THEN
        assertEquals("Miercuri pauza de masa are loc de la 9 PM la 10 PM",response);


    }
    @Test
    public void should_ShowLunchBreakForTueday(){
        //GIVEN
        int number=4;
        //WHEN
        String response = gRoom.workersRestTime(number);
        //THEN
        assertEquals("Joi pauza de masa are loc de la 7 PM la 8 PM",response);


    }
    @Test
    public void should_ShowLunchBreakForFriday(){
        //GIVEN
        int number=5;
        //WHEN
        String response = gRoom.workersRestTime(number);
        //THEN
        assertEquals("Vineri pauza de masa are loc de la 2 PM la 3 PM",response);


    }
    @Test
    public void should_ShowLunchBreakForSomeOtherDay(){
        //GIVEN
        int number=9;
        //WHEN
        String response = gRoom.workersRestTime(number);
        //THEN
        assertEquals("Mai si munciti, ce tot atatea pauze de masa? ",response);


    }
    @Test
    public void should_ShowNumberofEmployees(){
        //GIVEN
        int number=10;
        //WHEN
        int response= gRoom.numberOfWorkersForThisRoom();
        //THEN
        assertEquals(10,response);


    }
    @Test
    public void should_ShowNumberofEmployees1(){
        //GIVEN
        int number=9;
        //WHEN
        int response= gRoom.numberOfWorkersForThisRoom();
        //THEN
        assertEquals(9,response);


    }
    @Test
    public void should_ShowNumberofReservations(){
        //GIVEN
        int number=5;
        //WHEN
        int response= gRoom.numberOfReservations();
        //THEN
        assertEquals(5,response);


    }
    @Test
    public void should_ShowNumberofReservations1(){
        //GIVEN
        int number=7;
        //WHEN
        int response= gRoom.numberOfReservations();
        //THEN
        assertEquals(7,response);


    }






}
