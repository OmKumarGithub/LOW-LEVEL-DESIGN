package SOLID;

import java.util.*;
/*
                    OCP
 OPEN FOR EXTENSION BUT CLOSED FOR MODIFICATION



CLASS BUN GYI TO  USSE KABHI MODIFY NHI KRNA ...........KYUINKI SYSTEM DEPENDENT HOTA  .AGAR KOI CHANGE HUA ........TO APPLICATION SHUT DOWN HO SKTI HAI 
SO WHAT TO do? EXTEND IT ?
NO(JAB BHI KOI PROBLEM SOLVE KARNI HAI IN OOPS ....NEVER GO FOR CLASS INHERITANCE....IT CREATES MORE COMPLEXITY THAN SOLVING ONE )

SO WHAT TO DO ?????
THE ANSWER USE INTERFACE ...........
JAB TU USE KREGA INTERFACE FOR THIS , IT WILL BE CLOSELY RELATED TO STRATERGY PATTERN

 */


/*
 ***************************************Example not using OCP*****************************

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void calculateTotal() {
        double total = 0;
        for (Item item : items) {
            if (item.getType().equals("book")) {
                total += item.getPrice() * 0.95; // Apply 5% discount for books
            } else if (item.getType().equals("electronic")) {
                total += item.getPrice() * 1.1; // Apply 10% tax for electronics
            } else {
                total += item.getPrice();
            }
        }
        System.out.println("Total: $" + total);
    }
}

public class Item {
    private String type;
    private double price;

    public Item(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
******************************************************
 */



 // Example using OCP

 interface Open_Closed {
    double calculatePrice(double price);
}

class ShoppingCart {
    private List<Item> items;
    private Open_Closed pricingStrategy;

    public ShoppingCart(Open_Closed pricingStrategy) {
        this.items = new ArrayList<>();
        this.pricingStrategy = pricingStrategy;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += pricingStrategy.calculatePrice(item.getPrice());
        }
        System.out.println("Total: $" + total);
    }
}

class Item {
    private double price;

    public Item(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class BookPricingStrategy implements Open_Closed {
    @Override
    public double calculatePrice(double price) {
        return price * 0.95; 
    }
}

class ElectronicPricingStrategy implements Open_Closed {
    @Override
    public double calculatePrice(double price) {
        return price * 1.1; 
    }
}

