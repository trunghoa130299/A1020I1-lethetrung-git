package vn.codegym.repository;

import org.springframework.stereotype.Service;
import vn.codegym.model.Blog;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class BlogRepositoryImpl implements BlogRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Blog> findAll() {
        TypedQuery<Blog> query =entityManager.createQuery("select c from Blog c", Blog.class);
        return query.getResultList();
    }
    @Override
    public Blog findById(long id) {
        TypedQuery<Blog> query = entityManager.createQuery("select c from Blog c where c.id=:id", Blog.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }
    @Override
    public void save(Blog blog) {
        System.out.println(blog);
        entityManager.persist(blog);
    }
    @Override
    public void remove(long id) {
        Blog blog = findById(id);
        if (blog != null) {
            entityManager.remove(blog);
        }
    }
    @Override
    public void update(Blog blog) {
        entityManager.merge(blog);
    }
}
