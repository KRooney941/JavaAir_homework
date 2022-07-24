import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMembers cabinCrewMember;


    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMembers("Sally", Rank.CAPTAIN);
    }

    @Test
    public void hasName(){
        assertEquals("Sally", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.CAPTAIN, cabinCrewMember.getRank());
    }




}
