package Tarea.siete;

public class Main <T>{
		public static <T> void main(String[] args) {
			
		ADTColas g=new ADTColas<T>();
		System.out.println(g.isEmpty());
		g.enqueue(1);
		g.enqueue(2);
		g.enqueue(3);
		g.enqueue(5);
		g.enqueue(6);
		g.enqueue(7);
		g.enqueue(8);
		System.out.println(g.isEmpty());
		System.out.println(g.lista.toString());
		g.lenght();
		g.dequeue();
		g.dequeue();
		g.dequeue();
		g.dequeue();
		g.dequeue();
		g.lenght();
	}

}
