package es.indra.demoblog.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import es.indra.demoblog.model.Blog;
import es.indra.demoblog.repository.BlogRepository;
import es.indra.demoblog.service.BlogService;

@Component
public class BlogServiceImpl implements BlogService {

  @Autowired
  BlogRepository blogRepository;

  @Override
  public List<Blog> getAllBlog() {

    return this.blogRepository.findAll();
  }

  @Override
  public Blog getBlogById(int id) {

    Optional<Blog> blog0 = this.blogRepository.findById(id);
    if (blog0.isPresent()) {
      return blog0.get();
    } else {
      return null;
    }

    // return this.blogRepository.getOne(id);
  }

  @Override
  public Blog saveBlog(Blog blog) {

    return this.blogRepository.save(blog);
  }

  @Override
  public void removeBlog(Blog blog) {

    this.blogRepository.delete(blog);


  }

  @Override
  public Blog updateBlog(Blog blog) {

    if (this.getBlogById(blog.getId()) != null) {
      return this.blogRepository.save(blog);
    } else {
      return null;
    }
  }

}

