package model.reponsitory;

import model.bean.Customer;

import java.util.List;

public interface FuramaRepository {
    List<Customer> findAll();
}
