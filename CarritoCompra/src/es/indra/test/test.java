package es.indra.test;


import java.util.List;
import java.util.Scanner;
import es.indra.bean.Cliente;
import es.indra.bean.Historico;
import es.indra.bean.Producto;
import es.indra.negocio.Compra;
import es.indra.negocio.Tienda;

public class test {

  public static void main(String[] args) {
    
    //Imprime la lista de clientes
    Scanner sc = new Scanner(System.in);
    Tienda tienda = new Tienda();
    System.out.println("## Clientes dados de alta ##");
    List<Cliente>clientes = tienda.crearCliente();
    for (Cliente cli : clientes) {
      System.out.println(cli);
    }


    System.out.println("");


    
    //Imprime la lista de productos por categoria
    List<Producto> productos = tienda.crearProductos();
    System.out.println("Elieja una categoria: (Alimentacion,Perfumeria,Limpieza)");
    String cat = sc.nextLine();
    System.out.println("## Prodcuctos: " + cat+ " ##");
    for (Producto prod : productos) {
      if (prod.getCategoria().equals(cat)) {
        System.out.println(prod);
      }else{
        System.out.println(prod);        
      }
    }
    
    //Cambia el stock de los productos e imprime la lista actualizada
    System.out.println("");
    System.out.println("## Productos con stock actualizado: ##");
    tienda.cambiarStock(productos, "Judias",50);
    
    System.out.println(""); 
    
    //Impremi la lista de la compra
    Compra comp1 = new Compra(clientes.get(0), "03/09/2018");
    comp1.comprarPoducto(productos.get(0));
    comp1.comprarPoducto(productos.get(2));
    System.out.println("## Has comprado ##");
    System.out.println(comp1.getProductos());
    
    System.out.println("");
    
    //Imprime el total del precio de la compra
    System.out.println("## Total de la compra: ##");
    System.out.println(comp1.getTotal());
    System.out.println("");
    
    //Imprime el historico de compras de los clientes
    Historico historico = new Historico();
    historico.addCompra(clientes.get(0), comp1);
    
    sc.close();

      
    

    
  }

}
