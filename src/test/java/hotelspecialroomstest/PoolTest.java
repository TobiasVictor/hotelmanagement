package hotelspecialroomstest;
import hotelspecialrooms.Pool;
import org.junit.Before;
import org.junit.Test;
import static  org.junit.Assert.assertEquals;
public class PoolTest {
    private Pool pool;
    @Before
    void setup(){
        pool=new Pool();
    }
    @Test
    public void should_AllowKidsWithOver10Years(){
        int number=10;
        String response = pool.ageRestrict(number);
        assertEquals("Permis",response);
    }
    @Test
    public void should_Not_AllowKidsWithUnder10Years(){
        int number=9;
        String response = pool.ageRestrict(number);
        assertEquals("Respins",response);
    }
}
