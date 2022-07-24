import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;



    @Before
    public void before(){
        plane = new Plane(PlaneType.CESSNA172);
    }

    @Test
    public void hasCapacity(){
        assertEquals(3, plane.getCapacity());
    }

    @Test
    public void hasTotalWeight(){
        assertEquals(100, plane.getTotalWeight());
    }
}
