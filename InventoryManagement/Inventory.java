package InventoryManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;


public class Inventory {
    private final Map<Integer, InventoryItem> items = new HashMap<>();
    private final ReentrantLock lock = new ReentrantLock();

    public void addProduct(Product product){
        lock.lock();
        try{
            int id = product.getId();
            if(!items.containsKey(id)){
                items.put(id, new InventoryItem(product));
            }
        }
        finally{
            lock.unlock();
        }
       
    }

    public void addStock(int id, int quantity){
        lock.lock();
        try{
            if(!items.containsKey(id)){
                throw new RuntimeException("inventory item not found");
            }
            InventoryItem item = items.get(id);
            item.add(quantity);
        }
        finally{
            lock.unlock();
        }
    }

    public boolean buyProduct(int id, int quantity){
        lock.lock();
        try{
            if(!items.containsKey(id)){
                throw new RuntimeException("inventory item not found");
            }
            InventoryItem item = items.get(id);
            // if(item.getQuantity()< quantity){
            //     throw new RuntimeException("Please order in kesser quantity");
            // }


            return item.reduce(quantity);
        }
        finally{
            lock.unlock();
        }
    }

    public int getStock(int id){
        lock.lock();
        try{
            if(!items.containsKey(id)){
                throw new RuntimeException("inventory item not found");
            }
            InventoryItem item = items.get(id);
            return item.getQuantity();
        }
        finally{
            lock.unlock();
        }
    }
}
