/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shipping;


/**
 *
 * @author mrdon
 */


public class AirDelivery implements ShippingMethod {

    @Override
    public double calculateCost(double weight) {
        return 300 + 25 * weight;
    }
}