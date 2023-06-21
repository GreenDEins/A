package Method;
public class NewSmallContainer extends NewContainer {
    public NewSmallContainer() {
        super(2.59, 2.43, 6.06);
    }

    public double getShippingCost(double weight) {
        return weight <= 500.0 ? 1000.0 : 1200.0;
    }

    public double getWeightCapacity() {
        return 500.0;
    }

    public double getVolumeCapacity() {
        return 38.139822;
    }
}

//The NewSmallContainer class, which is a subclass of the NewContainer class, is defined here. The NewSmallContainer class represents a small container.
//
//In the constructor of the NewSmallContainer class, the constructor of the NewContainer superclass is called and the corresponding values for height, width and length of the container are passed to it.
//
//The NewSmallContainer class overrides the abstract methods getShippingCost(), getWeightCapacity() and getVolumeCapacity() according to its logic. The getShippingCost() method returns a shipping cost depending on the weight of the shipment: if the weight is less than 500.0, a cost of 1000.0 is returned, otherwise a cost of 1200.0 is returned. The getWeightCapacity() and getVolumeCapacity() methods return the corresponding values of weight and volume capacity of the small container.
//
//Thus, the NewSmallContainer class defines the characteristics and behavior of the small container, including its size, delivery cost, weight and volumetric capacity.
