import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Kieran", 1);
    }

    @Test
    public void hasName(){
        assertEquals("Kieran", passenger.getName());
    }

    @Test
    public void hasNoOfBags(){
        assertEquals(1, passenger.getNoOfBags());
    }

}
