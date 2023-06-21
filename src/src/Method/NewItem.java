package Method;
public class NewItem {
    private String name;
    private double weight;
    private double width;
    private double length;
    private double height;

    public NewItem(String name, double weight, double width, double length, double height) {
        this.name = name;
        this.weight = weight;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getHeight() {
        return this.height;
    }

    public double calculateVolume() {
        return this.width * this.length * this.height;
    }

    public void printItemInfo() {
        String var10001 = this.name;
        System.out.println("Name: " + var10001 + ", Weight: " + this.weight + ", Volume: " + this.calculateVolume());
    }
}

//A NewItem class is defined here, which represents an item. It has properties such as name, weight, width, length and height. The class constructor takes these properties as parameters and initialises their values.
//
//The NewItem class also has methods for getting property values (getName(), getWeight(), getWidth(), getLength(), getHeight()) and the calculateVolume() method, which calculates the volume of the item by multiplying its width, length and height.
//
//The printItemInfo() method outputs information about the item, including its name, weight, and volume.
//
//Thus, the NewItem class provides functionality to handle product information.