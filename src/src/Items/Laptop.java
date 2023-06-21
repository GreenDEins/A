package Items;
// This code defines a class Laptop, which is a subclass of the class Item.
//The Laptop class inherits properties and methods from the Item class and adds its own laptop-specific features.

public class Laptop extends Item {
    public Laptop() {
        super(0.6, 0.5, 0.5, 6.5);
    }

    public double calculateVolume() {
        return this.getWidth() * this.getLength() * this.getHeight();
    }
}
