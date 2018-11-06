package es.indra.aerolineas.beans;


import es.indra.aerolineas.beans.impl.Vuelo;

public interface IAerolinea {
  
    public void consultarVuelos() ;

	
	public void consultarVuelos(String origen, String destino);
		
	
	public void anularVuelos(String... vuelos );
	
	public String getNombre();
	
	public Vuelo[] getVuelos();
	
	

}
