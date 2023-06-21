package Method;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class NewCalculation {
    private final List<NewContainer> containers;
    private final Order order;

    public NewCalculation(Order order) {
        this.order = order;
        this.containers = new ArrayList();
        this.containers.add(new NewSmallContainer());
        this.containers.add(new NewBigContainer());
    }

    public double totalVolume() {
        double totalVolume = 0.0;

        Map.Entry entry;
        for(Iterator var3 = this.order.getItems().entrySet().iterator(); var3.hasNext(); totalVolume += ((NewItem)entry.getKey()).calculateVolume() * (double)(Integer)entry.getValue()) {
            entry = (Map.Entry)var3.next();
        }

        return totalVolume;
    }

    public double totalWeight() {
        double totalWeight = 0.0;

        Map.Entry entry;
        for(Iterator var3 = this.order.getItems().entrySet().iterator(); var3.hasNext(); totalWeight += ((NewItem)entry.getKey()).getWeight() * (double)(Integer)entry.getValue()) {
            entry = (Map.Entry)var3.next();
        }

        return totalWeight;
    }

    public List<ContainerPlan> bestShipping() {
        List<ContainerPlan> containerPlans = new ArrayList();
        double totalWeight = this.totalWeight();
        double totalVolume = this.totalVolume();
        Iterator var6 = this.containers.iterator();

        while(var6.hasNext()) {
            NewContainer container = (NewContainer)var6.next();
            int numberOfContainers = (int)Math.ceil(Math.max(totalWeight / container.getWeightCapacity(), totalVolume / container.getVolumeCapacity()));
            containerPlans.add(new ContainerPlan(container, numberOfContainers, totalWeight));
        }

        double minCost = Double.MAX_VALUE;
        List<ContainerPlan> bestPlans = new ArrayList();
        Iterator var9 = containerPlans.iterator();

        while(var9.hasNext()) {
            ContainerPlan plan = (ContainerPlan)var9.next();
            double cost = plan.getTotalCost();
            if (cost < minCost) {
                minCost = cost;
                bestPlans.clear();
                bestPlans.add(plan);
            } else if (cost == minCost) {
                bestPlans.add(plan);
            }
        }

        return bestPlans;
    }

    public double shippingPrice() {
        List<ContainerPlan> containerPlans = this.bestShipping();
        double totalCost = 0.0;

        ContainerPlan plan;
        for(Iterator var4 = containerPlans.iterator(); var4.hasNext(); totalCost += plan.getTotalCost()) {
            plan = (ContainerPlan)var4.next();
        }

        return totalCost;
    }

    public void printItemInfo() {
        Iterator var1 = this.order.getItems().entrySet().iterator();

        while(var1.hasNext()) {
            Map.Entry<NewItem, Integer> entry = (Map.Entry)var1.next();
            PrintStream var10000 = System.out;
            String var10001 = ((NewItem)entry.getKey()).getName();
            var10000.println("Item: " + var10001 + ", Quantity: " + String.valueOf(entry.getValue()));
        }

    }

    public void printOrderInfo() {
        this.printItemInfo();
        System.out.println("Total Volume: " + this.totalVolume());
        System.out.println("Total Weight: " + this.totalWeight());
        System.out.println("Shipping Price: " + this.shippingPrice());
        }
        }

        //This code defines the NewCalculation class, which represents the calculation and processing of the order.
//
//The NewCalculation class has the following basic methods and functionality:
//
//The NewCalculation constructor takes an Order object as a parameter and initializes a list of containers (containers) using instances of NewSmallContainer and NewBigContainer.
//
//The totalVolume() method calculates the total volume of the order by iterating over the order items (order.getItems()) and multiplying the volume of each item by its quantity.
//
//The totalWeight() method calculates the total weight of the order by iterating over the order items (order.getItems()) and multiplying the weight of each item by its quantity.
//
//The bestShipping() method determines the best delivery method by creating a list of container plans (ContainerPlan). For each container in the containers list, it calculates the number of containers needed to package the order based on the container's payload and order volume. A ContainerPlan object is then created for each container, specifying the container type, number of containers and total order weight. A list of the best container plans with a minimum shipping cost is returned.
//
//The shippingPrice() method calculates the total shipping cost by taking the list of best container plans using the bestShipping() method and summing the shipping costs from each plan.
//
//The printItemInfo() method outputs information about each order item, including its name and quantity.
//
//The printOrderInfo() method outputs information about the order, including information about each item, total volume, total weight and shipping cost.
//
//Thus, NewCalculation class provides functionality to calculate order volume and weight, determine the best delivery method and output order information.