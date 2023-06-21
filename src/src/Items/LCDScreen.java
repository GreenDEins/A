package Items;
//This code defines the LCDScreen class, which is a subclass of the Item class.
//The LCDScreen class inherits properties and methods from the Item class and adds its own features specific to LCD screens.


public class LCDScreen extends Item {
    public LCDScreen() {
        super(1.2, 1.4, 0.8, 2.6);
    }

    public double calculateVolume() {
        return this.getWidth() * this.getLength() * this.getHeight();
    }
}