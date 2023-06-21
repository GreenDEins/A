package Method;
import java.util.HashMap;

public class Order {
    private HashMap<NewItem, Integer> items = new HashMap();

    public Order() {
    }

    public void addOrder(NewItem item, int quantity) {
        this.items.put(item, quantity);
    }

    public HashMap<NewItem, Integer> getItems() {
        return this.items;
    }
}

//This code defines a class Order, which represents an order.
//
//The Order class has a private field items of type HashMap<NewItem, Integer> which stores pairs of order items and their quantity. HashMap is used to associate each item of the order (object of class NewItem) with its quantity (integer value).
//
//The Order class has a default constructor and methods:
//
//addOrder(NewItem item, int quantity): adds an order item with the specified quantity to items.
//getItems(): returns a HashMap with the order items.
//Thus, the Order class allows to add order items and their quantity, as well as get information about the current state of the order.