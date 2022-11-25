package laberinto.fes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.stream.Stream;

public class Arreglo2D<T> extends Pila {
	boolean b;
	public boolean[][] laberinto;
	public boolean camino;
	public boolean cerrado = false;
	public int fila;
	public int columna;
	int maxFila;
	int maxColumna;
	public boolean[][] tn;
	public boolean entrada = true;
	int entradaFila;
	int entradaColumna;
	public boolean salida = true;
	int salidaFila;
	int salidaColumna;
	public String[][] texto;
	String temp = "";
	String lab="";

	public void Arreglo2D() {
	}

	public void setLaberinto(int fila, int columna, boolean camino) {
		this.fila = fila;
		this.columna = columna;
		this.camino = camino;
		this.laberinto[fila][columna] = camino;
	}

	public String leerLaberinto(String archivo) {
		try {

			BufferedReader bf = new BufferedReader(new FileReader(archivo));

			this.maxFila = Integer.parseInt(bf.readLine());
			System.out.println(maxFila);
			this.maxColumna = Integer.parseInt(bf.readLine());
			System.out.println(maxColumna);
			laberinto = new boolean[maxFila][maxColumna];
			for (int i = 0; i < laberinto.length; i++) {
				temp = temp + "\n" + bf.readLine();

			}

			System.out.println(temp);
			this.entradaFila = Integer.parseInt(bf.readLine());
			System.out.println(entradaFila);
			this.entradaColumna = Integer.parseInt(bf.readLine());
			System.out.println(entradaColumna);
			this.salidaColumna = Integer.parseInt(bf.readLine());
			System.out.println(salidaColumna);
			this.salidaFila = Integer.parseInt(bf.readLine());
			System.out.println(salidaFila);
			entrada = laberinto[entradaFila][entradaColumna];

			salida = laberinto[salidaFila][salidaColumna];

		}

		catch (Exception e) {
			System.err.println("No se encontro archivo");
		}
		return archivo;

		// finally {
		// return null;
	}

	public void obtenerValorLaberinto() {
		for(int x=0; x<temp.length();x++) {
			char v = '0';
			char f = '1';
			char coma = ',';
			
			if(temp.charAt(x)==v) {
				
				lab=lab+"0";
				

			}
			if (temp.charAt(x) == f) {
				
				lab=lab+"1";

				
			}
			
		}
	
		temp=lab;
		System.out.println(lab);
		System.out.println(lab.length());
	
	}
		

	public void imprimirLaberinto() {// checar con n,s,e y o
		
		System.out.println("------------------------------");
		for (int i = 0; i < laberinto.length; i++) {
			System.out.println();
			
			for (int j = 0; j < laberinto[i].length; j++) {
				b= laberinto[i][j]; 
				
				for (int x = 0; x < temp.length(); x++) {
					
					b=laberinto[i][j];
					char v = '0';
					char f = '1';
					char coma = ',';
					
					if (temp.charAt(x) == v) {
						b = true;
						System.out.print(0);
						

					}
					if (temp.charAt(x) == f) {
						b = false;
						System.out.print(1);

					}
				}
					//if (temp.charAt(x) == coma) {
						
					//}
					
	
				
			}
		}
			
				
		

	}

	public void getNorte(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
		if (maxColumna == columna) {
			getOeste(fila, columna);
		}
		if (columna < maxColumna) {// checarr como en getSur
			columna = columna + 1;
			valor2 = columna;
			System.out.println(valor + " " + valor2);
		}
	}

	public void getSur(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
		if (columna == 0) {
			getEste(fila, columna);
		}
		if (columna <= maxColumna && columna > 0) {
			columna = columna + 1;
			valor2 = columna;
			System.out.println(valor + " " + valor2);
		}
	}

	public void getEste(int fila, int columna) {// terminar
		this.fila = fila;
		this.columna = columna;
		if (fila == maxFila) {
			fila = fila - 1;
			valor = fila;
			System.out.println(valor + " " + valor2);

		}
	}

	public void getOeste(int fila, int columna) {// terminar
		this.fila = fila;
		this.columna = columna;
	}

	public int getFila() {
		return fila;

	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public boolean[][] getLaberinto() {
		return laberinto;
	}

	public boolean isEntrada() {
		return entrada;
	}

	public void setEntrada(boolean entrada) {
		this.entrada = entrada;
	}

	public int getEntradaFila() {
		return entradaFila;
	}

	public void setEntradaFila(int entradaFila) {
		this.entradaFila = entradaFila;
	}

	public int getEntradaColumna() {
		return entradaColumna;
	}

	public void setEntradaColumna(int entradaColumna) {
		this.entradaColumna = entradaColumna;
	}

	public boolean isSalida() {
		return salida;
	}

	public void setSalida(boolean salida) {
		this.salida = salida;
	}

	public int getSalidaFila() {
		return salidaFila;
	}

	public void setSalidaFila(int salidaFila) {
		this.salidaFila = salidaFila;
	}

	public int getSalidaColumna() {
		return salidaColumna;
	}

	public void setSalidaColumna(int salidaColumna) {
		this.salidaColumna = salidaColumna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public int getMaxFila() {
		return maxFila;
	}

	public void setMaxFila(int maxFila) {
		this.maxFila = maxFila;
	}

	public int getMaxColumna() {
		return maxColumna;
	}

	public void setMaxColumna(int maxColumna) {
		this.maxColumna = maxColumna;
	}

	@Override
	public String toString() {
		return "Arreglo2D [fila=" + fila + ", columna=" + columna + "]";
	}

}
