package es.indra.carritocompraspring.service;

import java.util.List;
import org.springframework.stereotype.Service;
import es.indra.carritocompraspring.model.Producto;

@Service
public interface ProductoService {

  public List<Producto> getAllProductos();

  public Producto getProductoById(int id);

  public Producto saveProducto(Producto pro);

  public void removeProducto(Producto pro);

  public Producto updateProducto(Producto pro);

  public List<Producto> getAllProductosCategoria(int id);

}
