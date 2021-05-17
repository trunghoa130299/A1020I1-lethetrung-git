package model.reponsitory;

import model.bean.User;

import java.util.List;

public interface UserReponsitory {
    List<User> findAll();

    boolean save(User user);

    User findById(int id);

    boolean update( int id ,User user);

    boolean delete(int id);

    List<User> findByName(String name);
    List<User> sortUser();

}
