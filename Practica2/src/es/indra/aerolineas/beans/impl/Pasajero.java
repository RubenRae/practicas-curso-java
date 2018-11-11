/**
 * 
 */
package es.indra.aerolineas.beans.impl;

import java.util.Arrays;

/**
 * @author josejarizav
 *
 *
 */
public class Pasajero extends Persona {
	
	private Vuelo[] vuelos;
	Billete billete;
	
	
	

	public Pasajero() {
    
  }
	public Pasajero(String nombre,String apellido, Billete billete) {
	  super.nombre = nombre;
	  //super.id = id;
	  super.apellido= apellido;
	  this.billete = billete;
	}
	
	public Pasajero(String nombre, String apellido, String dni) {
		super.nombre= nombre;
		super.apellido = apellido;
		super.dni = dni;
		
	}

  
  public Billete getBillete() {
    return billete;
  }
  public void setBillete(Billete billete) {
    this.billete = billete;
  }
  /**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido.toUpperCase();
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the vuelos
	 */
	public Vuelo[] getVuelos() {
		return vuelos;
	}

	/**
	 * @param vuelos the vuelos to set
	 */
	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}

	@Override
	public String solicitarInformacion() {
		// TODO Auto-generated method stub
		return "";
	}
	@Override
	public String toString() {
		return "Pasajero [ nombre=" + nombre + ", apellido=" + apellido + "]";
	}

}
