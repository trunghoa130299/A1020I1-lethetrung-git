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
    public boolean saveUserTransaction(User user) {
        this.userReponsitory.saveUserTransaction(user);
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
    public boolean delete(int id) {
        this.userReponsitory.delete(id);
        return true;
    }
    @Override
   public List<User> findByName(String name){
        return this.userReponsitory.findByName(name);
    }
     public List<User> sortUser(){
        return this.userReponsitory.sortUser();
     }
}
