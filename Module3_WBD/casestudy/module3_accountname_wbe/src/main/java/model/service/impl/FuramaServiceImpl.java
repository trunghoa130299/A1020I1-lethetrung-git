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
}
