package InventoryManagement;

public class InventoryItem {
    private final Product product;
    private int quantity;
    public InventoryItem(Product product){
        this.product = product;
        quantity = 0;
    }

    public void add(int qty){
        quantity += qty;
    }

    public boolean reduce(int qty){
        if(qty> quantity){
            return false;
        }
        quantity -= qty;
        return true;
    }

    public int getQuantity(){
        return quantity;
    }

    public Product getProduct(){
        return product;
    }

}
