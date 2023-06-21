package Items;
//
// This code defines the Mouse class, which is a subclass of the Item class. The Mouse class represents a mouse and contains its own unique characteristics and methods.
//

public class Mouse extends Item {
    public Mouse() {
        super(0.3, 0.3, 0.2, 0.2);
    }

    public double calculateVolume() {
        return this.getWidth() * this.getLength() * this.getHeight();
    }
}
