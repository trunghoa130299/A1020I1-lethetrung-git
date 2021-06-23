package vn.codegym.repository;

import vn.codegym.model.Blog;

import java.util.List;

public interface BlogRepository {
    List<Blog> findAll();

     Blog findById(long id);

    void save(Blog blog);

    void remove(long id);

    void update(Blog blog);
}
