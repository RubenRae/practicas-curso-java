/**
 * 
 */
package es.indra.aerolineas.services;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

/**
 * @author aula12
 *
 */
public class ReadFile {
	
	public void retomarVuelos() {
		Path path = Paths.get("/Users/macbookpro/practicas-curso-java/vuelos.txt");
		
		try {
			List<String>contenido = Files.readAllLines(path);
			Iterator<String> iter = contenido.iterator();
		      while (iter.hasNext())
		        System.out.println(iter.next());	
		    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
    
		
	}
	

	

}
