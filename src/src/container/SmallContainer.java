package container;
//
//This code defines the SmallContainer class, which is a subclass of the Container class.
//

public class SmallContainer extends Container {
    public SmallContainer() {
        super(2.59, 2.43, 6.06, 1000.0);
        this.setMaxWeight(1000.0);
    }

    public double calculatePrice(double weight) {
        return weight <= 500.0 ? 1000.0 : 1200.0;
    }
}
