package es.indra.main;

public class Generics<T> {
	
	private T t;
	
	
	

	public T getT() {
		return t;
	}





	public void setT(T t) {
		this.t = t;
	}

	public <U extends Number> void revision(U u) {
		System.out.println("T es de tipo" + t.getClass().getName());
	}

	public static void main(String[] args) {


		Generics<Integer>caja1 =new Generics<>();
		caja1.setT(34);
		System.out.println(caja1.getT());
		caja1.revision(35);
		
		Generics<Double>caja11 =new Generics<>();
		caja1.setT(34);
		System.out.println(caja11.getT());
		caja11.revision(35d);
		
		
		
		
		
		
		Generics<String>caja2 = new Generics<>();
		caja2.setT("Hola");
		System.out.println(caja2.getT());

	}

}
