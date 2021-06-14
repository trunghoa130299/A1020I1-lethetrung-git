package vn.codegym.reponsitory;

import vn.codegym.model.Product;

import java.util.List;

public interface ProductReponsitory {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);
}
