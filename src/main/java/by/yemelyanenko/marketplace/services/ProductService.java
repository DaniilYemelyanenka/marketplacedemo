package by.yemelyanenko.marketplace.services;

import by.yemelyanenko.marketplace.entity.Product;
import by.yemelyanenko.marketplace.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    //TODO this method must takes DTO and then map to entity at save method argument
    public Product addProduct(Product product){

        //TODO need to add Not null check?
        return productRepository.save(product);
    }

    public Optional<Product> takeProductByID(Long id){
        return productRepository.findById(id);
    }
}
