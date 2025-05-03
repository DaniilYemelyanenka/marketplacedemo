package by.yemelyanenko.marketplace.repository;

import by.yemelyanenko.marketplace.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository  extends JpaRepository<Product,Long> {

    List<Product>  findAllByProductName(String name);
}
