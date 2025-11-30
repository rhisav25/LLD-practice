package InventoryManagement;
/*
 * This is the high level api design for inventory management
 * Here we have hidden the business logic
 */

public class InventoryManagement {
    Inventory inventory;
    public InventoryManagement(Inventory inventory){
        this.inventory = inventory;
    }

    //This is the api for adding item
    public void addItem(Product product){
        inventory.addProduct(product);
    }

    //this is the api for restocking
    public void addStock(int id, int quantity){
        inventory.addStock(id, quantity);
    }

    //this is the api for buying/removing stock
    public void removeStock(int id, int quantity){
        inventory.buyProduct(id, quantity);
    }

    //this is the api for getting product quantity
    public int getQuantity(int id){
        return inventory.getStock(id);
    }
    
}
