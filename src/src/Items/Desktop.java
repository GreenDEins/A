package Items;

//
// This code represents the Desktop class, which is a subclass of the Item class. The Desktop class represents the item "Desktop" and defines its characteristics and methods.
//

public class Desktop extends Item {
    public Desktop() {
        super(1.0, 1.5, 0.5, 20.0);
    }

    public double calculateVolume() {
        return this.getWidth() * this.getLength() * this.getHeight();
    }
}
