package model.reponsitory;

import model.bean.User;

import java.util.List;

public interface UserReponsitory {
    List<User> findAll();

    boolean save(User user);

    User findById(int id);

    void update(int id, User user);

    void remote(int id);

}
