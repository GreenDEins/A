package Method;

//
// The ContainerPlan class is used to store container delivery plan information and provides methods to retrieve relevant data, such as container type, number of containers, total weight and total delivery cost.
//

public class ContainerPlan {
    private NewContainer containerType;
    private int numberOfContainers;
    private double totalWeight;

    public ContainerPlan(NewContainer containerType, int numberOfContainers, double totalWeight) {
        this.containerType = containerType;
        this.numberOfContainers = numberOfContainers;
        this.totalWeight = totalWeight;
    }

    public NewContainer getContainerType() {
        return this.containerType;
    }

    public int getNumberOfContainers() {
        return this.numberOfContainers;
    }

    public double getTotalWeight() {
        return this.totalWeight;
    }

    public double getTotalCost() {
        return this.containerType.getShippingCost(this.totalWeight) * (double)this.numberOfContainers;
    }
}
