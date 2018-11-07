package es.indra.aerolineas.beans.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import es.indra.aerolineas.exceptions.ErrorLecturaDeVuelosException;
import es.indra.aerolineas.services.*;



public class Billete {
  
  //Pasajero pasajero;
  String numAsiento;
  String fecha;
  String vuelo;
  
  //String vuel;
  //String pas;
  
  public Billete() {
    
  }
  
  public Billete(String vuelo, String numAsiento, String fecha) {

  this.vuelo= vuelo;
  this.numAsiento=numAsiento;
  this.fecha=fecha;
  }
  
//  public Billete(Pasajero pasajero, String vuelo, String numAsiento, String fecha) {
//    this.pasajero = pasajero;
//    this.vuelo= vuelo;
//    this.numAsiento=numAsiento;
//    this.fecha=fecha;
//  }
  
  
  
//  public String getPas() {
//    return pas;
//  }

//  public void setPas(String pas) {
//    this.pas = pas;
//  }


  public String getVuelo() {
    return vuelo;
  }

  public void setVuelo(String vuelo) {
    this.vuelo = vuelo;
  }

//  public String getVuel() {
//    return vuel;
//  }
//
//  public void setVuel(String vuel) {
//    this.vuel = vuel;
//  }

//  public Pasajero getPasajero() {
//    return pasajero;
//  }
//  public void setPasajero(Pasajero pasajero) {
//    this.pasajero = pasajero;
//  }

  
  public String getNumAsiento() {
    return numAsiento;
  }
  public void setNumAsiento(String numAsiento) {
    this.numAsiento = numAsiento;
  }
  public String getFecha() {
    return fecha;
  }
  public void setFecha(String fecha) {
    this.fecha = fecha;
  }
  
  public List<Billete> crearBillete() {
    ReadFile r = new ReadFile();
    
    try {
      List<String> vuelo = r.retomarVuelos();
      String v1 = vuelo.get(0);
      String v2 = vuelo.get(1);
      String v3 = vuelo.get(2);
      
      List<Billete> bill = new ArrayList<>();
      Billete b1 = new Billete(v1,"44A","03/05/2018");
      bill.add(b1);
      Billete b2 = new Billete(v2,"44A","03/05/2018");
      bill.add(b2);
      Billete b3 = new Billete(v3,"44A","08/05/2018");
      bill.add(b3);
      return bill;
//       
//    List<Pasajero>pasajeros = new ArrayList<>();
//    Pasajero p1 = new Pasajero(1,"jose julian", "Lorenzo");
//    pasajeros.add(p1);
//    Pasajero p2 = new Pasajero(2,"Ruben","Alonso");
//    pasajeros.add(p2);
//    Pasajero p3 = new Pasajero(3,"Laura","Gomez");
//    pasajeros.add(p3);
//    for(Pasajero p : pasajeros) {
//      pas = p.getNombre();
//      //System.out.println(pas);
//    }
//    
//    
//    List<Billete>billetes = new ArrayList<>();
//    Billete b1 = new Billete(p1,v1,"45A","03/04/2018");
//    billetes.add(b1);
//    Billete b2 = new Billete(p2,v2,"23B","03/04/2018");
//    billetes.add(b2);
//    Billete b3 = new Billete(p3,v3,"34D","05/04/2018");
//    billetes.add(b3);
//    
//
//    Map<Billete,String> bill = new HashMap<>();
//    bill.put(b1,b1.getFecha());
//    bill.put(b2, b2.getFecha());
//    bill.put(b3, b3.getFecha());
//    
//   for(Map.Entry<Billete, String> b : bill.entrySet()) {
//     
//      if(b.getValue().equals(b.getValue())) {
//         
//      Billete vuel = b.getKey();
//      System.out.println(pas + " " + b.getValue() +" "+ vuel.getNumAsiento() + " " + vuel.getVuelo());
//      }
//   }
  } catch (ErrorLecturaDeVuelosException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  }return null;
  }
  
  
  public void verBilletesPorFecha(String fecha) {
    Billete b = new Billete();
    
    List<Billete> listaBilletes= b.crearBillete();
    
    Pasajero p1 = new Pasajero("Ruben", "Alonso",listaBilletes.get(0));
    Pasajero p2 = new Pasajero("Laura", "Diaz", listaBilletes.get(1));
    Pasajero p3 = new Pasajero("Robero","Gonzalez", listaBilletes.get(2));
    
    
    Map<Pasajero, String> billetesMismaFecha = new HashMap<>();
      billetesMismaFecha.put(p1,listaBilletes.get(0).getFecha());
      billetesMismaFecha.put(p2,listaBilletes.get(1).getFecha());
      billetesMismaFecha.put(p3,listaBilletes.get(2).getFecha());
      
      for(Map.Entry<Pasajero, String> j: billetesMismaFecha.entrySet()) {
        if(j.getValue().equals(fecha))
          
          
        System.out.println(j.getValue());
      
      }
      
    
    
    
  }
}
