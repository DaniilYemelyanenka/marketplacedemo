package by.yemelyanenko.marketplace.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String productName;

    private String imageUrl;

    private double price;

    public Product(String productName, String imageUrl, double price) {
        this.productName = productName;
        this.imageUrl = imageUrl;
        this.price = price;
    }
}
