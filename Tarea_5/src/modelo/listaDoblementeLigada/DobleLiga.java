package modelo.listaDoblementeLigada;

public class DobleLiga<T> {
	NodoDoble<T> head;
	NodoDoble<T> cola;
	int tamanio;

	public DobleLiga() {
		this.head = null;
		this.tamanio = 0;
	}

	public boolean estaVacia() {

		return this.head == null;
	}

	public int getTamanio() {
		if (this.estaVacia()) {
			tamanio = 0;
		} else {
			NodoDoble<T> aux = this.head;
			tamanio = 1;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();

				tamanio++;
			}
			System.out.println("Tamaño= " + tamanio);
		}
		return tamanio;
	}

	public void agregarAlFinal(T valor) {
		NodoDoble<T> nuevo = new NodoDoble<T>(valor);
		if (this.estaVacia()) {
			this.head = nuevo;
		} else {
			NodoDoble<T> aux = this.head;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			nuevo.setAnterior(aux);
			aux.setSiguiente(nuevo);
		}
	}

	public void agregarAlInicio(T valor) {
		NodoDoble<T> nuevo = new NodoDoble<T>(valor);
		if (this.estaVacia()) {
			this.head = nuevo;
		} else {
			nuevo.setSiguiente(this.head);
			this.head.setAnterior(nuevo);
			this.head = nuevo;
		}
	}

	public void agregarDespuesDe(T valor, int posicion) {
		NodoDoble<T> nuevo = new NodoDoble<T>(valor);
		NodoDoble<T> aux = this.head;
		for (int contador = 1; contador <= posicion - 1; contador++) {
			aux = aux.getSiguiente();
		}
		nuevo.setSiguiente(aux.getSiguiente());
		nuevo.setAnterior(aux);
		aux.setSiguiente(nuevo);
	}

	public void eliminar(int posicion) {
		NodoDoble<T> aux1 = this.head;
		NodoDoble<T> aux2 = null;
		for (int contador = 1; contador < posicion - 1; contador++) {
			aux1 = aux1.getSiguiente();
		}
		aux2 = aux1.getSiguiente().getSiguiente();
		aux1.setSiguiente(aux2);
		aux2.setAnterior(aux1);
	}

	public void eliminarElPrimero() {
		NodoDoble<T> aux = this.head;
		if (!this.estaVacia()) {
			this.head = aux.getSiguiente();
			this.head.setAnterior(null);
		}
	}

	public void eliminarElFinal() {
		if (!this.estaVacia()) {
			NodoDoble<T> aux = this.head;
			while (aux.getSiguiente().getSiguiente() != null) {
				aux = aux.getSiguiente();

			}
			aux.setSiguiente(null);
		} else {
			head = null;
		}
	}

	public int buscar(T valor) {
		int b = 1;
		NodoDoble<T> aux = this.head;
		while (aux != null && aux.getDato() != valor) {
			aux = aux.getSiguiente();
			b++;

		}

		System.out.println("Esta en la posicion " + b);
		return b;
	}

	public void transversal() {
		NodoDoble<T> curr_node = this.head;
		while (curr_node != null) {
			System.out.print(curr_node);
			curr_node = curr_node.getSiguiente();
		}
		System.out.println("");
	}
}
