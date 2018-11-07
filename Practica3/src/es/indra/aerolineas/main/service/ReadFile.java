package es.indra.aerolineas.main.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {
	
	public void retornarVuelos() {
		Path path = Paths.get("c:/Users/P.era-1/repositorios/CursoJava/destinos.txt");
		
		try {
			List<String>contenido = Files.readAllLines(path);
			//System.out.println(contenido);
			for (int i=0;i<=contenido.size()-1;i++) {// el -1 resta 1 al array
				System.out.println(contenido.get(i));
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

	public static void main (String []args){
		ReadFile r = new ReadFile();
		r.retornarVuelos();
	}

}
