package container;
//
// This code introduces an abstract class Container, which serves as a base class for creating different types of containers. It contains some properties and methods that can be common to all containers.
//

abstract class Container {
    private double width;
    private double length;
    private double height;
    private double maxWeight;
    private double price;

    Container(double width, double length, double height, double price) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.price = price;
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

    public double getMaxWeight() {
        return this.maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getPrice() {
        return this.price;
    }

    public double calculateVolume() {
        return this.getWidth() * this.getLength() * this.getHeight();
    }

    public abstract double calculatePrice(double var1);
}

//Thus this code provides a generic framework for creating and handling containers, but does not itself create specific container types. Subclasses that inherit from Container will implement the abstract calculatePrice method and add their own properties and methods specific to each container type.