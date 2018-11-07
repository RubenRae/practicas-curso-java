/**
 * 
 */
package es.indra.aerolineas.services;


import java.io.IOException;
import es.indra.aerolineas.beans.*;
import es.indra.aerolineas.exceptions.ErrorLecturaDeVuelosException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author aula12
 *
 */
public class ReadFile {
	
	public List<String> retomarVuelos() throws ErrorLecturaDeVuelosException {
		Path path = Paths.get("/Users/P.era-1/repositorios/Ruben/practicas-curso-java/vuelos.txt");
		List<String>contenido =new ArrayList<>();
		try {
			
			contenido = Files.readAllLines(path);
		    }catch (IOException e) {
			// TODO Auto-generated catch block
			throw new ErrorLecturaDeVuelosException("Fallo leyendo el archivo",e);
		    }finally {
		    	System.out.println("Leyendo archivo");
		    }
		return contenido;
    
		
	}
	
	//public List<String> retomarVuelosPropagandoError()throws IOException {
		//Path path = Paths.get("/Users/P.era-1/repositorios/Ruben/practicas-curso-java/vuelos.txt");
		//List<String>contenido =new ArrayList<>();
		
			
			//contenido = Files.readAllLines(path);
		    //return contenido;
	
	//}
	

}
