package es.indra.carritocompraspring.service;

import java.util.List;
import org.springframework.stereotype.Service;
import es.indra.carritocompraspring.model.Categoria;

@Service
public interface CategoriaService {

  public List<Categoria> getAllCategories();

  public Categoria getCategoriaById(int id);

  public Categoria saveCategoria(Categoria cat);

  public void removeCategoria(Categoria cat);

  public Categoria updateCategora(Categoria cat);

}
