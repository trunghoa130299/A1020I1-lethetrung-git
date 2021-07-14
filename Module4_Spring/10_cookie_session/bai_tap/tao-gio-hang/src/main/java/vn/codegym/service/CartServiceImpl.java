package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Cart;
import vn.codegym.repository.CartRepository;

import java.util.List;

@Service
public class CartServiceImpl  implements CartService{
    @Autowired
    CartRepository repository;

    @Override
    public List<Cart> findAll() {
        return repository.findAll();
    }

    @Override
    public Cart findById(int id) {
        return repository.findById(id).orElse(null);
    }
}
