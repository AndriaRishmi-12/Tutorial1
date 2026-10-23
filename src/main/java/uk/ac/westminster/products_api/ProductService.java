package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public List <Product> getAllProducts(){
        return products;
    }

    public Product addProduct (Product product){
        product.setId (nextId ++);
        products.add(product);
        return product;
    }
    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    public void deleteProduct (Long id){
        products.removeIf(p -> p.getId().equals(id));
    }

    public List<Product> findByName (String name){
        return products.stream()
                .filter(p-> p.getName().contains(name))
                .toList();

    }

    public ProductService() {
        products.add(new DigitalProduct(nextId++,"ebook", 9800.00,89.36,"/url/book"));
        products.add(new PhysicalProduct(nextId++,"music", 12000.00,5.32,"12cm * 15cm * 50cm"));
    }





}
