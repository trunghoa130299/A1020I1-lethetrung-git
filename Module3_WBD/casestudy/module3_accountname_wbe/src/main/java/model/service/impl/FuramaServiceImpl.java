package model.service.impl;

import model.bean.Customer;
import model.reponsitory.FuramaRepository;
import model.reponsitory.impl.FuramaRepositoryImpl;
import model.service.FuramaService;

import java.util.List;

public class FuramaServiceImpl implements FuramaService {
    private FuramaRepository furamaRepository = new FuramaRepositoryImpl();
    @Override
    public List<Customer> findAll() {
        return this.furamaRepository.findAll();
    }

    @Override
    public boolean createCustomer(Customer customer) {
        this.furamaRepository.createCustomer(customer);
        return true;
    }

    @Override
    public Customer findById(int id) {
        return this.furamaRepository.findById(id);
    }

    @Override
    public boolean updateCustomer(int id, Customer customer) {
        return this.furamaRepository.updateCustomer(id,customer);
    }

    @Override
    public boolean deleteCustomer(int id) {
        return this.furamaRepository.deleteCustomer(id);
    }
}
