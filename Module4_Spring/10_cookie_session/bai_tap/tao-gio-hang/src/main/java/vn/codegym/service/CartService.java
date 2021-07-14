package vn.codegym.service;

import vn.codegym.model.Cart;

import java.util.List;

public interface CartService {
    List<Cart> findAll();

    Cart findById(int id);
}
