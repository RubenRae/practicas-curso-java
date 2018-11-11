package es.indra.negocio;

import java.util.ArrayList;
import java.util.List;
import es.indra.bean.Cliente;
import es.indra.bean.Producto;



public class Tienda {
  
  //Metodo que crea la lista de clientes
  public List<Cliente> crearCliente(){

  List<Cliente> clientes = new ArrayList<>();
  Cliente c1 = new Cliente("Rueben", "Alonso", "calle a", 734264);
  clientes.add(c1);
  Cliente c2 = new Cliente("Laura", "Diaz", "calle b", 988217);
  clientes.add(c2);
  Cliente c3 = new Cliente("Juan", "Perez", "calle c", 32132);
  clientes.add(c3);
  return clientes;
  }
  
  
  //Metodo que crea la lista de productos
  public List<Producto> crearProductos(){
    
    List<Producto> productos = new ArrayList<>();
    Producto p1 = new Producto("Judias", "verdura", "Alimentacion", 2.99, 100);
    productos.add(p1);
    Producto p4 = new Producto("Lentejas", "legumbre", "Alimentacion", 2.99, 100);
    productos.add(p4);
    Producto p2 = new Producto("Colonia", "Nenuco", "Perfumeria", 5.99, 100);
    productos.add(p2);
    Producto p3 = new Producto("Detergente", "Fairy", "Limpieza", 7.99, 100);
    productos.add(p3);
    
    return productos;
     
  }
  
  //Metodo que modifica el stock de los productos
  public List<Producto> cambiarStock(List<Producto> productos, String nombre, int stock) {

    for (Producto pro : productos) {
      if (pro.getNombre().equals(nombre)) {
        pro.setCantidad(stock);

      }
      System.out.println(pro);
    }
    return productos;

  }
}


