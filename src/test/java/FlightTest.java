import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Plane plane;
    Flight flight;
    Passenger passenger;
    Pilot pilot;

    CabinCrewMembers cabinCrewMembers;

    @Before
    public void before(){
        passenger = new Passenger("Kieran", 1);
        plane = new Plane(PlaneType.CESSNA172);
        flight = new Flight(plane, pilot, "FR756", "EDI", "GLA", "10:15");
        pilot = new Pilot("Sally", Rank.CAPTAIN, "SS321");
        cabinCrewMembers = new CabinCrewMembers("Jimmy", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void canGetBookedPassengersList(){
        assertEquals(0, flight.bookedPassengers());
    }

    @Test
    public void canGetAvailableSeats(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(1, flight.getAvailableSeats());
    }

    @Test
    public void canAddToPassengersList(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.bookedPassengers());
    }

    @Test
    public void cantExceedCapacity(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(3, flight.bookedPassengers());
    }

    @Test
    public void pilotCanFlyPlane(){
        assertEquals("This is your captain speaking. This is flight number FR756 with a destination of EDI and aim to depart at 10:15", flight.pilotSpeak());
    }

    @Test
    public void cabinCrewMemberSpeak(){
        assertEquals("Welcome aboard", flight.cabinCrewSpeak());
    }


}
