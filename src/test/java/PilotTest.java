import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;


    @Before
    public void before(){
        pilot = new Pilot("Tom", Rank.PILOT, "FK123");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Tom", pilot.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals(Rank.PILOT, pilot.getRank());
    }

    @Test
    public void pilotHasLicenceNum(){
        assertEquals("FK123", pilot.getLicenceNumber());
    }



}
