package hilos;

import java.util.Set;

public class Heredando extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		System.out.println("Dentro de run");
		try {
		if(getName().equals("Hilo 1")) {
			
				sleep(3000);
				System.out.println("Por fin despierto!!");
				
		}else if(getName().equals("Hilo 2")) {
			System.out.println("Soy: ".concat(getName()));
				sleep(5000);
			} else {
				System.out.println("Soy otro hilo: ".concat(getName()));
			}
			}catch (InterruptedException e) {
				e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Heredando h = new Heredando();
		h.setName("Hilo 1");// pone nombre al hilo
		h.start(); //arranca el hilo y llama al metodo run
		
		Heredando h2 = new Heredando();
		h2.setName("Hilo 2");// pone nombre al hilo
		h2.start(); //arranca el hilo y llama al metodo ru
		
		Heredando h3 = new Heredando();
		h3.setName("Hilo 3");// pone nombre al hilo
		h3.start(); //arranca el hilo y llama al metodo ru
	
		System.out.println("Hilos en ejecucion: " + Heredando.activeCount());
		
		Set<Thread>hilos = Heredando.getAllStackTraces().keySet();
		for(Thread hilo : hilos) {
			StringBuilder sb = new StringBuilder();
			sb.append("\"" + hilo.getName() + "\"");
			sb.append(":");
			sb.append(hilo.getPriority());
			sb.append(":");
			sb.append(hilo.isDaemon());
			sb.append(":");
			sb.append(hilo.getState());
			
			System.out.println("\t" + sb);
			
			
		}
		
	}
	

}
