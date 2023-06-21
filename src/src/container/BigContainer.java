package container;

//
// This code defines the BigContainer class, which is a subclass of the Container class. The BigContainer class represents a large container for the delivery of goods and defines its characteristics and methods.
//

public class BigContainer extends Container {
    public BigContainer() {
        super(2.59, 2.43, 12.01, 1800.0);
    }

    public double calculatePrice(double weight) {
        return this.getPrice();
    }
}