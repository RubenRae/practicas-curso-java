/**
 * 
 */
package es.indra.aerolineas.main.impl;

import es.indra.aerolineas.beans.Vuelo;
import es.indra.aerolineas.main.service.ReadFile;

/**
 * @author josejarizav
 *
 *
 */
public class Aerolinea implements IAaerolinea {
	
	private int id;
	private String nombre;
	private Vuelo[] vuelos = new Vuelo[10];
	ReadFile archivo = new ReadFile();
	
	public Aerolinea() {	
		
		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param vuelos
	 */
	public Aerolinea(int id, String nombre, Vuelo[] vuelos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.vuelos = vuelos;
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
	 * @return the nombre
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the vuelos
	 */
	@Override
	public Vuelo[] getVuelos() {
		return vuelos;
	}

	/**
	 * @param vuelos the vuelos to set
	 */
	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}

	
	/* (non-Javadoc)
	 * @see es.indra.aerolineas.main.impl.IAaerolinea#consultarVuelos(java.lang.String)
	 */
	@Override
	public void consultarVuelos(String origen) {
		System.out.println("Metado1  parametro".concat(origen));
		archivo.retornarVuelos();
	}
	

		/* (non-Javadoc)
		 * @see es.indra.aerolineas.main.impl.IAaerolinea#consultarVuelos(java.lang.String, java.lang.String)
		 */
		@Override
		public void consultarVuelos(String origen,String destino) {
			System.out.printf("Metado 2 parametros :%s y %s %n", origen, destino);
	}
	
		/* (non-Javadoc)
		 * @see es.indra.aerolineas.main.impl.IAaerolinea#anularVuelos8(java.lang.String)
		 */
		@Override
		public void anularVuelos8(String...vuelos) {
			System.out.println("numero de vuelos a anular : " + vuelos.length);
		}

}
