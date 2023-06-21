package Items;
public abstract class Item {
    private double width;
    private double length;
    private double height;
    private double weight;

    Item(double width, double length, double height, double weight) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.weight = weight;
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

    public double getWeight() {
        return this.weight;
    }

    public abstract double calculateVolume();

    public void printInfo() {
        System.out.println("Item info: width=" + this.width + ", length=" + this.length + ", height=" + this.height + ", weight=" + this.weight);
    }
}
//This code defines an abstract Item class that represents a product.
//
//The Item class contains private fields:
//
//width - width of the item
//length - length of item
//height - height of item
//weight - product weight.
//The Item(double width, double length, double height, double weight) constructor initializes the product fields with the values passed in the constructor arguments.
//
//The Item class also has the following methods:
//
//getWidth(), getLength(), getHeight(), getWeight() - access methods (getters) to get the values of the corresponding product fields.
//calculateVolume() is an abstract method to be implemented in subclasses and returns the volume of the product.
//printInfo() is a method that outputs information about the item, including its width, length, height and weight.
//Thus, the Item class provides a basic structure for representing an item and defines common properties and operations that can be used in subclasses to represent specific item types with their unique properties and methods.