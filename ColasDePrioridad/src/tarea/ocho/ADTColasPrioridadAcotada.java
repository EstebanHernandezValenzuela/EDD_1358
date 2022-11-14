package tarea.ocho;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ADTColasPrioridadAcotada<T> {
	T[][] lista;
	
	int tamanio;
	int x = 1;
	int niveles;
	Object l;
	int k = 1;
	T b = null;
	public ADTColasPrioridadAcotada(int niveles) {
		this.niveles = niveles;
		lista = (T[][]) new Array[niveles][niveles];
	
		tamanio = 0;
		
		int y;
		int z = 1;
		for (int i = 0; i < niveles; i++) {
			y = i;

			l = (T) lista[i][0];

			l = y;
			y = y + 1;

		}
	}

	public boolean isEmpty() {
		
		return (T) lista == null;

	}

	public int lenght() {
		System.out.println("Hay " + tamanio + " elementos");
		return tamanio;
	}

	public void dequeue() {
		int z = 0;
		

		if (isEmpty()) {
			System.out.println("No hay valores disponibles");
		} else {

			System.out.println((T) lista[z][k]);
			
			System.out.println(b);
			

		}k = k + 1;
	}

	public void enqueue(T value, int nivel) {
		
		if ((T) lista[nivel][x] == null) {
			b = value;
			b = (T) lista[nivel][x];
			lista[nivel][x] = (T) b;
			

			System.out.println(lista[nivel][x]);
			System.out.println(value);
			
			x = x + 1;
		}
		if (lista[nivel][x] != null) {
			x = x + 1;
			
		
			b = lista[nivel][x];
			b = value;
			lista[nivel][x] = b;
			x = x + 1;
			System.out.println(lista[nivel][x]);
			System.out.println(value);
		}
		tamanio=tamanio+1;
	}

	@Override
	public String toString() {
		String estado = "";

		for (T[] elemento : lista) {
			if (elemento != null) {

				estado += "\n " + elemento.toString();
			}
		}
		return estado;
	}
}
