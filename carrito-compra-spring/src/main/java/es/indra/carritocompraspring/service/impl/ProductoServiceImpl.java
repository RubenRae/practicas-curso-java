package es.indra.carritocompraspring.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import es.indra.carritocompraspring.model.Producto;
import es.indra.carritocompraspring.repository.ProductoRepository;
import es.indra.carritocompraspring.service.ProductoService;

@Component
public class ProductoServiceImpl implements ProductoService {


  @Autowired
  ProductoRepository productoRepository;


  @Override
  public List<Producto> getAllProductos() {

    return this.productoRepository.findAll();
  }

  @Override
  public Producto getProductoById(int id) {
    Optional<Producto> pro0 = this.productoRepository.findById(id);
    if (pro0.isPresent()) {
      return pro0.get();
    } else {
      return null;
    }
  }

  @Override
  public Producto saveProducto(Producto pro) {

    return this.productoRepository.save(pro);
  }

  @Override
  public void removeProducto(Producto pro) {

    this.productoRepository.delete(pro);
  }

  @Override
  public Producto updateProducto(Producto pro) {

    if (this.getProductoById(pro.getId()) != null) {
      return this.productoRepository.save(pro);
    } else {
      return null;
    }
  }

  @Override
  public List<Producto> getAllProductosCategoria(int id) {


    return this.productoRepository.getProductoByCategoria_id(id);

  }



}
