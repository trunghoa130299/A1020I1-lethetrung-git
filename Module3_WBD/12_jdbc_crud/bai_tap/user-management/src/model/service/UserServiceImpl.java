package model.service;

import model.bean.User;
import model.reponsitory.UserReponsitory;
import model.reponsitory.UserReponsitoryImpl;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserReponsitory userReponsitory = new UserReponsitoryImpl();
    @Override
    public List<User> findAll() {
        return this.userReponsitory.findAll();
    }
    @Override
    public boolean save(User user) {
        this.userReponsitory.save(user);
        return true;
    }

    @Override
    public User findById(int id) {
        return this.userReponsitory.findById(id);
    }

    @Override
    public boolean update( int id,User user) {
        this.userReponsitory.update(id,user);
        return true;
    }

    @Override
    public void remote(int id) {
        this.userReponsitory.remote(id);
    }
}
