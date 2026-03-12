/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shipping;

import org.junit.Test;
import static org.junit.Assert.*;

public class BikeDeliveryTest {

    @Test
    public void weightUnderLimit() {
        BikeDelivery b = new BikeDelivery();
        assertEquals(80, b.calculateCost(3), 0.001);
    }

    @Test
    public void weightAtLimit() {
        BikeDelivery b = new BikeDelivery();
        assertEquals(80, b.calculateCost(5), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void weightOverLimit() {
        BikeDelivery b = new BikeDelivery();
        b.calculateCost(6);
    }
}