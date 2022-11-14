package tarea.ocho;

public class Main {
	public static <T> void main(String[] args) {
		ADTColasPrioridadAcotada<Object> m=new ADTColasPrioridadAcotada<>(6);
		m.enqueue(1, 1);
		m.enqueue(2, 1);
	m.enqueue(3, 5);
		
		m.dequeue();
	
	}
}
