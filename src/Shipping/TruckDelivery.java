package Shipping;

public class TruckDelivery implements ShippingMethod {

    @Override
    public double calculateCost(double weight) {
        return 100 + 10 * weight;
    }
}