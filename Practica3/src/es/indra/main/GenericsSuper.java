package es.indra.main;

import java.util.ArrayList;
import java.util.List;

public class GenericsSuper<T> {
	
	private T t;
	
	
	public T getT() {
		return t;
	}

	void setT(T t) {
		this.t = t;
	}

	
	

	public static void main(String[] args) {


		GenericsSuper<? super Integer>caja1 =new GenericsSuper<>();
		caja1.setT(34);
		List<? super Integer>listado = new ArrayList<>();
		listado.add(23);
		listado.add(67);
		
		GenericsSuper<Double>caja11 =new GenericsSuper<>();
		caja1.setT(34);
		System.out.println(caja11.getT());
		
		
		
		
		
		
		
		GenericsSuper<String>caja2 = new GenericsSuper<>();
		caja2.setT("Hola");
		System.out.println(caja2.getT());

	}

}
