package by.yemelyanenko.marketplace.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CartItemInfo {

    private Long productId;

    private String productName;

    private double price;

    private int quantity;

    public double getTotalPrice(){
        return price * quantity;
    }
}
