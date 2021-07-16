package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;
import vn.codegym.model.Blog;
import vn.codegym.model.Category;
import vn.codegym.service.BlogService;
import vn.codegym.service.CategoryService;

import java.util.List;

@RestController
public class BlogController {

    @Autowired
    BlogService blogService;

    @Autowired
    CategoryService categoryService;
    @ModelAttribute("categories")
    public List<Category> provinces(){
        return categoryService.findAll();
    }

    @RequestMapping(value = "/create-blog", method = RequestMethod.POST)
    public ResponseEntity<Void> createBlog(@RequestBody Blog blog, UriComponentsBuilder ucBuilder) {
        System.out.println("Creating blog " + blog.getName());
        blogService.save(blog);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/edit-blog/{id}").buildAndExpand(blog.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/blogs", method = RequestMethod.GET)
    public ResponseEntity<Page<Blog>> listAllBlogs(Pageable pageable) {
        Page<Blog> blogs = blogService.findAllPage(pageable);
        if (blogs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }
    @RequestMapping(value = "//edit-blog/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Blog> getBlog(@PathVariable("id") int id) {
        System.out.println("Fetching blog with id " + id);
        Blog blog = blogService.findById(id);
        if (blog == null) {
            System.out.println("blog with id " + id + " not found");
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Blog>(blog, HttpStatus.OK);
    }

    @RequestMapping(value = "/edit-blog/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Blog> updateBlog(@PathVariable("id") int id, @RequestBody Blog blog) {
        System.out.println("Updating blog " + id);

        Blog currentBlog = blogService.findById(id);

        if (currentBlog == null) {
            System.out.println("blog with id " + id + " not found");
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }

        currentBlog.setName(blog.getName());
        currentBlog.setImage(blog.getImage());
        currentBlog.setContent(blog.getContent());
        currentBlog.setCategory(blog.getCategory());
        currentBlog.setId(blog.getId());

        blogService.save(currentBlog);
        return new ResponseEntity<Blog>(currentBlog, HttpStatus.OK);
    }

    @RequestMapping(value = "/delete-blog/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Blog> deleteBLog(@PathVariable("id") int id) {
        System.out.println("Fetching & Deleting blog with id " + id);

        Blog blog = blogService.findById(id);
        if (blog == null) {
            System.out.println("Unable to delete. blog with id " + id + " not found");
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }

        categoryService.remove(id);
        return new ResponseEntity<Blog>(HttpStatus.NO_CONTENT);
    }
}