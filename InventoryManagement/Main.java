package InventoryManagement;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        InventoryManagement ims = new InventoryManagement(inventory);

        Product p1 = new Product(1, "Laptop");
        Product p2 = new Product(2, "Watches");

        ims.addItem(p1);
        ims.addItem(p2);

        System.out.println("Before adding stocks purchase");

        System.out.println("The current stock of p1 product is " + ims.getQuantity(1));
        System.out.println("The current stock of p1 product is " + ims.getQuantity(2));
        
        ims.addStock(1, 10);
        ims.addStock(2, 15);

       System.out.println("After adding stocks purchase");

        System.out.println("The current stock of p1 product is " + ims.getQuantity(1));
        System.out.println("The current stock of p1 product is " + ims.getQuantity(2));

        ims.removeStock(1, 4);
        ims.removeStock(2, 6);
        System.out.println("After purchase");

        System.out.println("The current stock of p1 product is " + ims.getQuantity(1));
        System.out.println("The current stock of p1 product is " + ims.getQuantity(2));

    }
}
