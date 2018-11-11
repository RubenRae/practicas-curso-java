package es.indra.negocio;

import java.util.ArrayList;
import java.util.List;
import es.indra.bean.Cliente;
import es.indra.bean.Producto;

public class Compra {

  Cliente cliente;
  List<Producto> productos;
  String fecha;
  double total;


  public Compra() {

  }

  public Compra(Cliente cliente, String fecha) {
    super();
    this.cliente = cliente;
    this.fecha = fecha;
  }

  public double getTotal() {
    return total;
  }

  public Cliente getCliente() {
    return cliente;
  }


  public List<Producto> getProductos() {
    return productos;
  }


  public String getFecha() {
    return fecha;
  }

  //Metod que añade a la lista los productos comprados
  public void comprarPoducto(Producto p) {

    if (productos == null) {
      productos = new ArrayList<>();
    }
    if (p.getCantidad() != 0) {

      productos.add(p);
      total=p.getPrecio() + total;

    }

  }

  
  


  @Override
  public String toString() {
    return "Compras [cliente=" + cliente + ", productos=" + productos + ", fecha=" + fecha
        + ", total=" + total + "]";
  }



}
