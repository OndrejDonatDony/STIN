/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shipping;

import org.junit.Test;
import static org.junit.Assert.*;

public class TruckDeliveryTest {

    @Test
    public void normalWeight() {
        TruckDelivery t = new TruckDelivery();
        assertEquals(200, t.calculateCost(10), 0.001);
    }

    @Test
    public void zeroWeight() {
        TruckDelivery t = new TruckDelivery();
        assertEquals(100, t.calculateCost(0), 0.001);
    }
}
