package by.yemelyanenko.marketplace.model;

import java.util.ArrayList;
import java.util.List;

public class CartInfo {

    private List<CartItemInfo> items = new ArrayList<>();

    public List<CartItemInfo> getItems() {
        return items;
    }

    public void addItem(CartItemInfo item) {
        for (CartItemInfo existing : items) {
            if (existing.getProductId().equals(item.getProductId())) {
                existing.setQuantity(item.getQuantity() + item.getQuantity());
            }
            return;
        }
        items.add(item);
    }

    public void removeItem(Long itemId) {
        items.removeIf(item -> item.getProductId().equals(itemId));
    }

    public int getCount() {
        return items.stream().mapToInt(CartItemInfo::getQuantity).sum();
    }

    public double getTotal(){
        return items.stream().mapToDouble(CartItemInfo::getTotalPrice).sum();
    }

    public void clear(){
        items.clear();
    }
}