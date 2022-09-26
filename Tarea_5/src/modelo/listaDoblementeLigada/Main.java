package modelo.listaDoblementeLigada;

public class Main {
	public static void main(String[] args) {
		DobleLiga<Integer> head = new DobleLiga<Integer>();

		head.agregarAlInicio(1);
		head.agregarAlFinal(2);
		head.agregarAlFinal(3);
		head.agregarAlFinal(4);
		head.agregarAlFinal(5);
		head.agregarAlFinal(6);
		head.agregarAlFinal(7);
		head.transversal();
		head.getTamanio();
		head.agregarAlInicio(0);
		head.transversal();
		head.eliminarElPrimero();
		head.transversal();
		head.eliminarElFinal();
		head.transversal();
		head.eliminar(2);
		head.transversal();
		head.buscar(6);

	}
}
