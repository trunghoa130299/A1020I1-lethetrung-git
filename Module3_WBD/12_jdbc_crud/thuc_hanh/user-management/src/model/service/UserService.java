package model.service;

import model.bean.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    boolean save(User user);

    User findById(int id);

    void update(int id, User user);

    void remote(int id);
}
