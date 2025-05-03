package by.yemelyanenko.marketplace.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartItemInfo {

    private Long productId;

    private String productName;

    private double price;

    private int quantity;

    public double getTotalPrice(){
        return price * quantity;
    }
}
