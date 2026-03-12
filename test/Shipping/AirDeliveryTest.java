/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shipping;

import org.junit.Test;
import static org.junit.Assert.*;

public class AirDeliveryTest {

    @Test
    public void normalWeight() {
        AirDelivery a = new AirDelivery();
        assertEquals(425, a.calculateCost(5), 0.001);
    }

    @Test
    public void zeroWeight() {
        AirDelivery a = new AirDelivery();
        assertEquals(300, a.calculateCost(0), 0.001);
    }
}