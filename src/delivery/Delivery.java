/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package delivery;

/**
 *
 * @author mrdon
 */
public abstract class Delivery {
    private String id;
    private int weight;
    private DeliverOption deliveryOption;

    public Delivery(String id, int weight, DeliverOption deliveryOption) {
        this.id = id;
        this.weight = weight;
        this.deliveryOption = deliveryOption;
    }
    
    public int calculatePrice(deliveryOption){
        return deliveryOption.calculatePrice();
    }
    
    
}
