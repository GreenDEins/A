package Method;
public abstract class NewContainer {
    private double height;
    private double width;
    private double length;

    public NewContainer(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public abstract double getShippingCost(double var1);

    public abstract double getWeightCapacity();

    public abstract double getVolumeCapacity();

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }
}

//This code defines an abstract class NewContainer that represents a delivery container. It has the following basic methods and functionality:
//
//The constructor of NewContainer takes the height, width and length parameters and initializes the corresponding fields of the class.
//
//The getShippingCost(double var1) abstract method provides subclasses to determine the shipping cost for a given container type. This method takes shipping weight as a parameter and must be implemented in every NewContainer subclass.
//
//The getWeightCapacity() abstract method provides subclasses with the ability to determine the container's payload capacity (the maximum weight it can carry). This method must be implemented in every NewContainer subclass.
//
//The getVolumeCapacity() abstract method provides subclasses with the ability to define the container's capacity (the maximum volume it can hold). This method must be implemented in every NewContainer subclass.
//
//The getHeight(), getWidth() and getLength() methods return the appropriate container height, width and length values.
//
//The toString() method returns a simple container class name (without the package), which can be used to output container type information.
//
//The NewContainer class is abstract, so it cannot be instantiated directly, but can be used to define general container behaviour and properties to be implemented in its subclasses