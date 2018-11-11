package es.indra.aerolineas.beans.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import es.indra.aerolineas.exceptions.ErrorLecturaDeVuelosException;
import es.indra.aerolineas.services.*;



public class Billete {
  
  String numAsiento;
  String fecha;
  String vuelo;
  
  public Billete() {
    
  }
  
  public Billete(String vuelo, String numAsiento, String fecha) {

  this.vuelo= vuelo;
  this.numAsiento=numAsiento;
  this.fecha=fecha;
  }


  public String getVuelo() {
    return vuelo;
  }

  public void setVuelo(String vuelo) {
    this.vuelo = vuelo;
  }

  
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
      Billete b2 = new Billete(v2,"12C","03/05/2018");
      bill.add(b2);
      Billete b3 = new Billete(v3,"35B","08/05/2018");
      bill.add(b3);
      return bill;

  } catch (ErrorLecturaDeVuelosException e) {
    
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
          
          
       System.out.println(j.getValue()+ " " + j.getKey() + j.getKey().getBillete());
      
      }
      
    
    
    
  }

@Override
public String toString() {
	return "Billete [numAsiento=" + numAsiento + ", fecha=" + fecha + ", vuelo=" + vuelo + "]";
}
}
