package com.adhiambo.kombe.service;

import com.adhiambo.kombe.entity.Product;
import com.adhiambo.kombe.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product save_product(Product product){
       return repository.save(product);
    }

    public List<Product> save_products(List<Product> products){
        return repository.saveAll(products);
    }

    public List<Product> getProducts(){
        return repository.findAll();
    }

    public Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }


    public Product findByName(String name){
        return repository.findByName(name);
    }

    public String deleteProductById(int id){
         repository.deleteById(id);
        return id+" removed";
    }

    public Product update_product(Product product){
        Product existing = repository.findById(product.getId()).orElse(null);
        existing.setName(product.getName());
        existing.setQuantity(product.getQuantity());
        existing.setPrice(product.getPrice());
        return repository.save(existing);
    }
}
