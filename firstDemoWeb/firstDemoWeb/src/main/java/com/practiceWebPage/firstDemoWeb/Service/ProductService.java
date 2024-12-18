package com.practiceWebPage.firstDemoWeb.Service;

import com.practiceWebPage.firstDemoWeb.Model.Product;
import com.practiceWebPage.firstDemoWeb.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

/*
    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Iphone", 50000),
            new Product(102,"Cannon Camera", 70000)));
*/


    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductByID(int prodID){
        return repo.findById(prodID).orElse(new Product());
    }

    public void addProduct(Product prod){
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodID) {
        repo.deleteById(prodID);
    }
}
