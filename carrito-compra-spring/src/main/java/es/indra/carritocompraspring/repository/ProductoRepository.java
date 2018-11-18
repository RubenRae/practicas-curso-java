package es.indra.carritocompraspring.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import es.indra.carritocompraspring.model.Producto;


@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

  public List<Producto> getProductoByCategoria_id(int id);
}
