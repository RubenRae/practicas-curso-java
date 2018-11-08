package es.indra.aerolineas.services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import es.indra.aerolineas.beans.impl.Pasajero;

public class WriteFile {
	
	public void crearArchivoPasajeros() {
		
		String ruta = ("/Users/P.era-1/repositorios/practicas-curso-java/pasajeros.txt");
		
		Pasajero p1 = new Pasajero("Ruben", "Alonso", "7547483A");
		Pasajero p2 = new Pasajero("Laura", "Diaz", "7544583D");
		Pasajero p3 = new Pasajero("Juan", "Gonzalez", "76577483R");
	
		BufferedWriter bw;
		
		File archivo = new File(ruta);
		
		
		try {
			if(archivo.exists()) {
				bw = new BufferedWriter(new FileWriter(archivo));
				
				bw.write(p1.getNombre()+";"+p2.getApellido()+";"+ p3.getDni());
				bw.newLine();
				bw.write(p2.getNombre()+";"+p2.getApellido()+";"+ p2.getDni());
				bw.newLine();
				bw.write(p3.getNombre()+";"+p3.getApellido()+";"+ p3.getDni());
				bw.newLine();
				bw.flush();
				System.out.println("El archivo ya exite");
			}else{
				bw = new BufferedWriter(new FileWriter(archivo));
				
			bw.write(p1.getNombre()+";"+p1.getApellido()+";"+ p1.getDni() +"\n" );
			bw.newLine();
			bw.write(p2.getNombre()+";"+p2.getApellido()+";"+ p2.getDni() +"\n" );
			bw.newLine();
			bw.write(p3.getNombre()+";"+p3.getApellido()+";"+ p3.getDni() +"\n" );
			bw.newLine();
			bw.flush();
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
