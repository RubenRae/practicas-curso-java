package es.indra.carritocompraspring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Categoria {

  @Id
  @GeneratedValue
  int id;
  private String nombre;

  public Categoria() {

  }


  public Categoria(int id) {
    super();
    this.id = id;
  }



  public Categoria(int id, String nombre) {
    super();
    this.id = id;
    this.nombre = nombre;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "Categoria [id=" + id + ", nombre=" + nombre + "]";
  }



}
