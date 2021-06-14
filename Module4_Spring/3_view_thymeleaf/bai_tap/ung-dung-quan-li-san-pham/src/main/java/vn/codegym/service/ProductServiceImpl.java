package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Product;
import vn.codegym.reponsitory.ProductReponsitory;
import vn.codegym.reponsitory.ProductReponsitoryImpl;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    ProductReponsitory productReponsitory = new ProductReponsitoryImpl();
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
