package Method;
//
// The class in which all calculations are made to determine which container we will need to transport the goods
//

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Items.Item;
import container.BigContainer;
import container.SmallContainer;

class Calculation {
    private List<Item> items = new ArrayList();
    private SmallContainer smallContainer = new SmallContainer();
    private BigContainer bigContainer = new BigContainer();
    

    private int i=0;
    private int smallContainersCount;
    private int bigContainersCount;
    private double remainVol;
    private double totalPrice;
    Calculation() {
    }

    void addItem(Item item) {
        this.items.add(item);
    }

    double calculateTotalWeight() {
        double totalWeight = 0.0;

        Item item;
        for(Iterator var3 = this.items.iterator(); var3.hasNext(); totalWeight += item.getWeight()) {
            item = (Item)var3.next();
        }

        return totalWeight;
    }

    double calculateTotalVolume() {
        double totalVolume = 0.0;

        Item item;
        for(Iterator var3 = this.items.iterator(); var3.hasNext(); totalVolume += item.calculateVolume()) {
            item = (Item)var3.next();
        }

        return totalVolume;
    }

    void bestShipping() {
        double totalWeight = this.calculateTotalWeight();
        double totalVolume = this.calculateTotalVolume();
        int bigContainersCount = 0;
      int smallContainersCount = 0;
      double totalPrice = 0.0;
//        return totalWeight <= this.smallContainer.getMaxWeight() && totalVolume <= this.smallContainer.calculateVolume() ? this.smallContainer.calculatePrice(totalWeight) : this.bigContainer.calculatePrice(totalWeight);
   
        bigContainersCount = (int)(totalVolume/bigContainer.calculateVolume()) ;
        double remainVol = totalVolume % bigContainer.calculateVolume() ;
        if(remainVol<smallContainer.calculateVolume()){
        	smallContainersCount++;
            System.out.println(bigContainersCount+" Big Container and "+smallContainersCount+" small container preferred");
        }
        else{
        	bigContainersCount++;
            System.out.println(bigContainersCount +" Big Container and "+smallContainersCount+" small container preferred");
        }
    
    }

//    public void calculateContainers() {
//        double totalWeight = this.calculateTotalWeight();
//        double totalVolume = this.calculateTotalVolume();
////        int bigContainersCount = 0;
////        int smallContainersCount = 0;
//        double totalPrice = 0.0;
//
//        while(totalWeight > 0.0 || totalVolume > 0.0) {
//            if (totalWeight <= this.smallContainer.getMaxWeight() && totalVolume <= this.smallContainer.calculateVolume()) {
//                ++smallContainersCount;
//                totalPrice += this.smallContainer.calculatePrice(totalWeight);
//                totalWeight -= this.smallContainer.getMaxWeight();
//                totalVolume -= this.smallContainer.calculateVolume();
//            } else {
//                if (!(totalWeight >= this.bigContainer.getMaxWeight()) || !(totalVolume >= this.bigContainer.calculateVolume())) {
//                    System.out.println("The remaining items cannot fit into a container. Please revise the item quantities or container types.");
//                    break;
//                }
//
//                ++bigContainersCount;
//                totalPrice += this.bigContainer.getPrice();
//                totalWeight -= this.bigContainer.getMaxWeight();
//                totalVolume -= this.bigContainer.calculateVolume();
//            }
//        
//
//        System.out.println("The optimal shipping method is: " + bigContainersCount + " big containers and " + smallContainersCount + " small containers.");
//        System.out.println("The best shipping cost is: " + totalPrice + " Euros.");
//    
//        }    
//        
//    }
    
    public double shippingPrice() {
    	for (int i=0;i< smallContainersCount;i++ ) {
    	    if (remainVol < smallContainer.calculateVolume() && calculateTotalWeight() <= 500) {
                System.out.println("small container price wg less than 500 KG: " + 1000);
                totalPrice+=1000;
            } else {
                System.out.println("small container price wg more than 500 KG: " + 1200);
                totalPrice+=1200;
            }
        }
    for(i=0;i< bigContainersCount;i++){
//        System.out.println("large Container price  "+1800+"Euros");
        totalPrice =totalPrice+1800 ;
    }
   
   
    System.out.println( bigContainersCount+"Big Container price "+ bigContainersCount*1800+"Euros");
    return totalPrice;

    		
    	
    	
    }
    public void printOrder() {
    	System.out.println(totalPrice);
    }
    
}

//This code defines a Calculation class, which represents the calculation and delivery management of goods.
//
//        There are private fields inside the class:
//
//        items - List<Item> items for delivery, initialized with an empty list of type ArrayList.
//        smallContainer - an object of class SmallContainer, representing a small container for delivery of items.
//        bigContainer - an object of class BigContainer, representing a large container for delivery of items.
//        The Calculation class has a constructor Calculation(), which does not perform any additional actions.
//
//        The class also contains the following methods:
//
//        void addItem(Item item) - adds an item to the items list.
//        double calculateTotalWeight() - calculates the total weight of items by summing up the weight of each item in the items list.
//        double calculateTotalVolume() - calculates the total volume of items by summing up the volume of each item in the items list.
//        double bestShipping() - determines the best option for shipping items based on total weight and volume. If the total weight and volume of the items is less than or equal to the small container limit, the small container shipping price is returned. Otherwise, it returns the shipping price of the large container.
//        void calculateContainers() - calculate and schedule the delivery of goods. The loop performs placing goods into containers as long as there are goods or free space left. If the goods cannot be placed in the containers, an error message is displayed. The optimal delivery method (number of large and small containers) and the total cost of delivery are then output.
//        Thus, this code defines a Calculation class that manages the delivery of goods, calculates the total weight and volume of goods, determines the best delivery method, and plans the use of containers for delivery.