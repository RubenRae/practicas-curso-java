package es.indra.demoblog.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import es.indra.demoblog.model.Blog;
import es.indra.demoblog.service.BlogService;

@RestController
public class BlogController {

  @Autowired
  BlogService blogService;

  @RequestMapping(value = "/blog", method = RequestMethod.GET)
  public ResponseEntity<List<Blog>> getAllBlogs() {
    List<Blog> todosLosBlogs = this.blogService.getAllBlog();

    ResponseEntity<List<Blog>> response =
        new ResponseEntity<List<Blog>>(todosLosBlogs, HttpStatus.OK);

    return response;

  }

  @RequestMapping(value = "/blog/{id}", method = RequestMethod.GET)
  public ResponseEntity<Blog> getById(@PathVariable("id") int id) {
    Blog b = this.blogService.getBlogById(id);
    if (b == null) {
      ResponseEntity<Blog> response = new ResponseEntity<Blog>(b, HttpStatus.OK);
      return response;

    } else {
      ResponseEntity<Blog> error = new ResponseEntity<Blog>(b, HttpStatus.NOT_FOUND);
      return error;

    }

  }

  @RequestMapping(value = "/blog", method = RequestMethod.POST)
  public ResponseEntity<Void> crearBlog(@RequestBody Blog b) {
    Blog blog = this.blogService.saveBlog(b);

    return new ResponseEntity<Void>(HttpStatus.CREATED);
  }

  @RequestMapping(value = "/blog/{id}", method = RequestMethod.DELETE)
  public ResponseEntity<Void> borrarBlog(@PathVariable("id") int id) {
    Blog blog = this.blogService.getBlogById(id);
    blogService.removeBlog(blog);

    return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);

  }

  @RequestMapping(value = "/blog", method = RequestMethod.PUT)
  public ResponseEntity<Blog> updateToDo(@RequestBody Blog b) {

    Blog blog = this.blogService.updateBlog(b);
    if (blog != null) {

      ResponseEntity<Blog> response = new ResponseEntity<Blog>(blog, HttpStatus.OK);
      return response;
    } else {
      ResponseEntity<Blog> error = new ResponseEntity<Blog>(blog, HttpStatus.NOT_FOUND);
      return error;
    }



  }

}
