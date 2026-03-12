package Shipping;

public class BikeDelivery implements ShippingMethod {

    @Override
    public double calculateCost(double weight) {
        if (weight > 5) {
            throw new IllegalArgumentException("BikeDelivery lze pouzit jen pro zasilky do 5 kg.");
        }
        return 80;
    }
}