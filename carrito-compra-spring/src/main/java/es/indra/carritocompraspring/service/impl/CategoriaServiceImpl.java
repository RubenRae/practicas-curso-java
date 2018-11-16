package es.indra.carritocompraspring.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import es.indra.carritocompraspring.model.Categoria;
import es.indra.carritocompraspring.repository.CategoriaRepository;
import es.indra.carritocompraspring.service.CategoriaService;


@Component
public class CategoriaServiceImpl implements CategoriaService {

  @Autowired
  CategoriaRepository categoriaRepository;

  @Override
  public List<Categoria> getAllCategories() {

    return this.categoriaRepository.findAll();
  }

  @Override
  public Categoria getCategoriaById(int id) {
    Optional<Categoria> cat0 = this.categoriaRepository.findById(id);
    if (cat0.isPresent()) {
      return cat0.get();
    } else {
      return null;
    }
  }

  @Override
  public Categoria saveCategoria(Categoria cat) {

    return this.categoriaRepository.save(cat);
  }

  @Override
  public void removeCategoria(Categoria cat) {

    this.categoriaRepository.delete(cat);


  }

  @Override
  public Categoria updateCategora(Categoria cat) {

    if (this.getCategoriaById(cat.getId()) != null) {
      return this.categoriaRepository.save(cat);
    } else {
      return null;
    }
  }



}
