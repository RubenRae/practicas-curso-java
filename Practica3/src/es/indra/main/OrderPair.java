package es.indra.main;

public class OrderPair<K,V> implements Pair<K,V> {
	
	private K key;
	private V value;
	
	public OrderPair(K key,V value) {
		this.key=key;
		this.value=value;
	}
	
	public K getKey() {
		return key;
	
	}
	
	public V getValue() {
		return value;
	}

	public static void main(String[] args) {
		
		Pair<Integer,String> p1 = new OrderPair<>(1,"rojo");
		System.out.println(p1.getKey() + " " + p1.getValue());
		
		Pair<Integer,String> p2 = new OrderPair<>(2,"azul");
		System.out.println(p2.getKey() + " " + p2.getValue());
		
		
		
		
		

	}

}
