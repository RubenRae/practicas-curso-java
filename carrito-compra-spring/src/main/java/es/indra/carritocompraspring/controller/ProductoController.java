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
import es.indra.carritocompraspring.aspects.anotacion.MedidorTiempo;
import es.indra.carritocompraspring.model.Producto;
import es.indra.carritocompraspring.service.ProductoService;


@RestController
public class ProductoController {

  @Autowired
  ProductoService productoService;

  @MedidorTiempo
  @RequestMapping(value = "/producto", method = RequestMethod.GET)
  public ResponseEntity<List<Producto>> getAllProductos() {

    List<Producto> todosLosProductos = this.productoService.getAllProductos();

    ResponseEntity<List<Producto>> response =
        new ResponseEntity<List<Producto>>(todosLosProductos, HttpStatus.OK);

    return response;

  }

  @RequestMapping(value = "/producto/{id}", method = RequestMethod.GET)
  public ResponseEntity<Producto> getById(@PathVariable("id") int id) {
    Producto p = this.productoService.getProductoById(id);
    if (p == null) {
      ResponseEntity<Producto> response = new ResponseEntity<Producto>(p, HttpStatus.OK);
      return response;

    } else {
      ResponseEntity<Producto> error = new ResponseEntity<Producto>(p, HttpStatus.NOT_FOUND);
      return error;

    }

  }

  @RequestMapping(value = "/producto", method = RequestMethod.POST)
  public ResponseEntity<Void> crearProducto(@RequestBody Producto p) {
    Producto pro = this.productoService.saveProducto(p);

    return new ResponseEntity<Void>(HttpStatus.CREATED);
  }

  @RequestMapping(value = "/producto/{id}", method = RequestMethod.DELETE)
  public ResponseEntity<Void> borrarProducto(@PathVariable("id") int id) {
    Producto pro = this.productoService.getProductoById(id);
    productoService.removeProducto(pro);

    return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);

  }

  @RequestMapping(value = "/producto", method = RequestMethod.PUT)
  public ResponseEntity<Producto> updateToDo(@RequestBody Producto p) {

    Producto pro = this.productoService.updateProducto(p);
    if (pro != null) {

      ResponseEntity<Producto> response = new ResponseEntity<Producto>(pro, HttpStatus.OK);
      return response;
    } else {
      ResponseEntity<Producto> error = new ResponseEntity<Producto>(pro, HttpStatus.NOT_FOUND);
      return error;
    }
  }

}
