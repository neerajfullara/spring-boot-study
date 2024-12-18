package com.practiceWebPage.firstDemoWeb.Controller;

import com.practiceWebPage.firstDemoWeb.Model.Product;
import com.practiceWebPage.firstDemoWeb.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/products/{prodID}")
    public Product getProductByID(@PathVariable int prodID){
        return service.getProductByID(prodID);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        service.addProduct(prod);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodID}")
    public void deleteProduct(@PathVariable int prodID){
        service.deleteProduct(prodID);
    }
}
