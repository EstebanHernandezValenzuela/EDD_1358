package laberinto.fes;

import javax.management.modelmbean.ModelMBeanOperationInfo;

public class Main {
	public static <T> void main(String[] args) {
		Arreglo2D<T> m=new Arreglo2D<T>();
		Pila<T> g=new Pila<>();
		m.leerLaberinto("C:\\Users\\popo\\OneDrive\\Escritorio\\ModLaberinto.txt");
	
		m.obtenerValorLaberinto();
		
		m.imprimirLaberinto();

		
	
	}
}

