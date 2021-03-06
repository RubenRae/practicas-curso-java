package es.indra.bean;

public class Producto {
  
  private String nombre;
  private String descripcion;
  private String categoria;
  private double precio;
  private int cantidad;
  
  
  public Producto() {
    
  }

  public Producto(String nombre, String descripcion, String categoria, double precio,int cantidad) {
    super();
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.categoria = categoria;
    this.precio = precio;
    this.cantidad = cantidad;
  }
  
  

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  @Override
  public String toString() {
    return "Producto [nombre=" + nombre + ", descripcion=" + descripcion + ", categoria="
        + categoria + ", precio=" + precio + ", cantidad=" + cantidad + "]";
  }

 
  
  
  

}
