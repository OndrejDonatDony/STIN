package delivery;

import Shipping.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class DeliveryTest {

    @Test
    public void truckDelegation() {
        Delivery d = new Delivery("CZ001", 10, new TruckDelivery());
        assertEquals(200, d.calculatePrice(), 0.001);
    }

    @Test
    public void bikeDelegation() {
        Delivery d = new Delivery("CZ002", 3, new BikeDelivery());
        assertEquals(80, d.calculatePrice(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void bikeExceptionPropagation() {
        Delivery d = new Delivery("CZ003", 10, new BikeDelivery());
        d.calculatePrice();
    }
}