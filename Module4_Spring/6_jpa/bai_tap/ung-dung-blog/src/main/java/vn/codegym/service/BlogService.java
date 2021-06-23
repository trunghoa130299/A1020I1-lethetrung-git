package vn.codegym.service;

import vn.codegym.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();

    Blog findById(long id);

    void save(Blog blog);

    void remove(long id);

    void update(Blog blog);
}
