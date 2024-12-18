package com.practiceWebPage.firstDemoWeb.Service;

import com.practiceWebPage.firstDemoWeb.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Iphone", 50000),
            new Product(102,"Cannon Camera", 70000)));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductByID(int prodID) {
        return products.stream().filter(p -> p.getProdID() == prodID).findFirst().orElse(new Product(100,"No Item",0 ));
    }

    public void addProduct(Product prod){
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index = 0;
        for (int i = 0; i < products.size(); i++)
            if(products.get(i).getProdID() == prod.getProdID())
                index = i;

        products.set(index,prod);
    }

    public void deleteProduct(int prodID) {
        int index = 0;
        for (int i = 0; i < products.size(); i++)
            if(products.get(i).getProdID() == prodID)
                index = i;
        products.remove(index);
    }
}
