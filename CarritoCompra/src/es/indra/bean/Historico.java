package es.indra.bean;

import java.util.HashMap;
import java.util.Map;
import es.indra.negocio.Compra;

public class Historico {
  
  
  Map<Cliente, Compra> hist;
  
  
  
  
 public Map<Cliente, Compra> getHist() {
    return hist;
  }




  //Metodo que crea un mapa con la clave cliente y valo compra
  public void addCompra(Cliente cliente, Compra compra) {
    System.out.println("## Historial: ##");
    
    if(hist==null) {
      hist = new HashMap<>();
      
      }hist.put(cliente, compra);
      for(Map.Entry<Cliente, Compra> list : hist.entrySet()) {
        System.out.println(list.getValue());
    }
    
    
   
    
    
    
  }
  
  
  
  


}
