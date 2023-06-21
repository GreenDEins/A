package Method;
//Artur Yurchenko 80904023
import java.util.Scanner;

import Items.*;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the count of laptops: ");
        int laptops = scanner.nextInt();

        int mouse;
        for(mouse = 0; mouse < laptops; ++mouse) {
            calculation.addItem(new Laptop());
        }

        System.out.print("Enter the count of mouse: ");
        mouse = scanner.nextInt();

        int desktops;
        for(desktops = 0; desktops < mouse; ++desktops) {
            calculation.addItem(new Mouse());
        }

        System.out.print("Enter the count of desktops: ");
        desktops = scanner.nextInt();

        int lcdScreens;
        for(lcdScreens = 0; lcdScreens < desktops; ++lcdScreens) {
            calculation.addItem(new Desktop());
        }

        System.out.print("Enter the count of LCD screens: ");
        lcdScreens = scanner.nextInt();

        for(int i = 0; i < lcdScreens; ++i) {
            calculation.addItem(new LCDScreen());
        }

        calculation.bestShipping();
        calculation.shippingPrice();
        calculation.printOrder();
    }
}
//This code defines the Main class, which contains the main method as the entry point of the program.
//
//In main method an object of Calculation class is created, which will be used to calculate delivery. Then an object of class Scanner is created to read input from console.
//
//The program then asks the user for the number of laptops, mice, desktops and LCD screens to be delivered. Then the appropriate number of objects of corresponding classes (Laptop, Mouse, Desktop, LCDScreen) are added to calculation object in cycles using addItem() method.
//
//After all necessary items have been added, calculateContainers() method of calculation object is called, which calculates the best delivery method and displays the result on the screen.
//
//In this way, the program prompts the user to enter the quantity of each item type for delivery and then uses the entered data to calculate the optimal delivery method using the Calculation class.