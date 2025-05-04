package by.yemelyanenko.marketplace.services;

import by.yemelyanenko.marketplace.entity.Product;
import by.yemelyanenko.marketplace.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product){
        return productRepository.save(product);
    }
}
