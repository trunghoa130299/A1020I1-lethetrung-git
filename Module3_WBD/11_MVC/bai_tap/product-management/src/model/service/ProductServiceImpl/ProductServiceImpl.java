package model.service.ProductServiceImpl;

import model.bean.Product;
import model.service.ProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "John", 12, "Hanoi"));
        products.put(2, new Product(2, "Bill", 13, "Danang"));
        products.put(3, new Product(3, "Alex", 14, "Saigon"));
        products.put(4, new Product(4, "Adam", 15, "Beijin"));
        products.put(5, new Product(5, "Sophia", 16, "Miami"));
        products.put(6, new Product(6, "Rose", 17, "Newyork"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
