package es.indra.aerolineas.main.impl;

import es.indra.aerolineas.beans.Vuelo;

public interface IAaerolinea {

	void consultarVuelos(String origen);

	void consultarVuelos(String origen, String destino);

	void anularVuelos8(String... vuelos);

	Vuelo[] getVuelos();

	String getNombre();

}