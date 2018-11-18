package es.indra.carritocompraspring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import es.indra.carritocompraspring.model.Categoria;
import es.indra.carritocompraspring.service.CategoriaService;


@RestController
public class CategoriaController {

  @Autowired
  CategoriaService categoriaService;

  @RequestMapping(value = "/categoria", method = RequestMethod.GET)
  public ResponseEntity<List<Categoria>> getAllCategories() {

    List<Categoria> todasLasCategorias = this.categoriaService.getAllCategories();

    ResponseEntity<List<Categoria>> response =
        new ResponseEntity<List<Categoria>>(todasLasCategorias, HttpStatus.OK);

    return response;

  }

  @RequestMapping(value = "/categoria/{id}", method = RequestMethod.GET)
  public ResponseEntity<Categoria> getByIdCategoria(@PathVariable("id") int id) {
    Categoria c = this.categoriaService.getCategoriaById(id);
    if (c == null) {
      ResponseEntity<Categoria> response = new ResponseEntity<Categoria>(c, HttpStatus.OK);
      return response;

    } else {
      ResponseEntity<Categoria> error = new ResponseEntity<Categoria>(c, HttpStatus.NOT_FOUND);
      return error;

    }

  }

  @RequestMapping(value = "/categoria", method = RequestMethod.POST)
  public ResponseEntity<Void> crearCategoria(@RequestBody Categoria c) {
    Categoria categoria = this.categoriaService.saveCategoria(c);

    return new ResponseEntity<Void>(HttpStatus.CREATED);
  }

  @RequestMapping(value = "/categoria/{id}", method = RequestMethod.DELETE)
  public ResponseEntity<Void> borrarCategoria(@PathVariable("id") int id) {
    Categoria cat = this.categoriaService.getCategoriaById(id);
    categoriaService.removeCategoria(cat);

    return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);

  }

  @RequestMapping(value = "/categoria", method = RequestMethod.PUT)
  public ResponseEntity<Categoria> updateToDo(@RequestBody Categoria c) {

    Categoria cat = this.categoriaService.updateCategora(c);
    if (cat != null) {

      ResponseEntity<Categoria> response = new ResponseEntity<Categoria>(cat, HttpStatus.OK);
      return response;
    } else {
      ResponseEntity<Categoria> error = new ResponseEntity<Categoria>(cat, HttpStatus.NOT_FOUND);
      return error;
    }
  }

}
