package com.adhiambo.kombe.controller;

import com.adhiambo.kombe.entity.Product;
import com.adhiambo.kombe.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;

    @PostMapping("/save_product")
    public Product save_product(@RequestBody Product product){
        return service.save_product(product);
    }

    @PostMapping("/save_products")
    public List<Product> save_products(@RequestBody List<Product> products){
        return service.save_products(products);
    }

    @GetMapping("/getProducts")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/getProductById/{id}")
    public Product getProductById(@PathVariable int id){
        return service.getProductById(id);
    }

    @GetMapping("/findByName/{name}")
    public Product findByName(@PathVariable String name){
        return service.findByName(name);
    }

    @PutMapping("/update_product")
    public Product update_product(@RequestBody Product product){
        return service.update_product(product);
    }

    @DeleteMapping("/deleteProductById/{id}")
    public String deleteProductById(@PathVariable int id){
        return service.deleteProductById(id);
    }
}
