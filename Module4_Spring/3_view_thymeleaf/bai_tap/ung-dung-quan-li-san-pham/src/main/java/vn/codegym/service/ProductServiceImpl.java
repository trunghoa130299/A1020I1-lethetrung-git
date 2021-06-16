package vn.codegym.service;

import vn.codegym.model.Product;
import vn.codegym.repository.ProductRepository;
import vn.codegym.repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    ProductRepository productReponsitory = new ProductRepositoryImpl();
    @Override
    public List<Product> findAll() {
        return this.productReponsitory.findAll();
    }

    @Override
    public void save(Product product) {
        this.productReponsitory.save(product);
    }

    @Override
    public Product findById(int id) {
        return this.productReponsitory.findById(id);
    }

    @Override
    public void update(int id, Product product) {
        this.productReponsitory.update(id,product);
    }

    @Override
    public void remove(int id) {
        this.productReponsitory.remove(id);
    }
}
