/**
 * 
 */
package es.indra.aerolineas.beans;

/**
 * @author Daniel vuelve el nombre de persona que necesita los pasajeros1
 *
 */




public class Empleado extends Persona {
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre.toUpperCase();
	}

	@Override//clase abstracta se autogenera 
	public String solicitarInformacion() {
		// TODO Auto-generated method stub
		return null;
	}
}
