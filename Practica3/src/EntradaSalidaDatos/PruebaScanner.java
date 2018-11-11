package EntradaSalidaDatos;

import java.util.Scanner;

public class PruebaScanner {
	 public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	
	int a;
	int b;
	
	
	
	System.out.println("Introduce un numero:");
	a = sc.nextInt();
	
	System.out.println("Introduce segundo numero: ");
	b= sc.nextInt();
	
	int resultado = a+b;
	System.out.println("El resultado de la suma es: " + resultado);
	
	sc.close();

}
}
