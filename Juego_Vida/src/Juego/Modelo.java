package Juego;

import java.io.InputStream;
import java.security.DrbgParameters.NextBytes;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Modelo {

	private boolean[][] tabla = new boolean[10][10];
	public boolean celula;
	public int fila, columna;
	int maxFila = 9;
	int maxColumna = 9;
	public boolean[][] tn = new boolean[10][10];

	public void imprimirtabla() {

		for (int i = 0; i < tabla.length; i++) {
			System.out.println();
			for (int j = 0; j < tabla[i].length; j++) {
				boolean b = tabla[i][j];
				if (b == false) {
					System.out.print("*");
				} else {
					System.out.print("O");
				}

			}
		}
	}

	public void setTabla(int fila, int columna, boolean celula) {
		this.celula = celula;
		this.columna = columna;
		this.fila = fila;
		tabla[fila][columna] = celula;
	}

	public int celVivasAlrededor(int fila, int columna) {
		int maxFila = 9;
		int maxColumna = 9;
		int lc, rc;
		int tf, bf;
		lc = getColumnaIzquierda(columna);
		rc = getColumnaDerecha(columna);

		tf = getFilaArriba(fila);
		bf = getFilaAbajo(fila);

		int contarVivas = 0;

		if (tabla[lc][fila])
			contarVivas++;
		if (tabla[rc][fila])
			contarVivas++;
		if (tabla[columna][tf])
			contarVivas++;
		if (tabla[columna][bf])
			contarVivas++;

		if (tabla[lc][tf])
			contarVivas++;
		if (tabla[lc][bf])
			contarVivas++;
		if (tabla[rc][tf])
			contarVivas++;
		if (tabla[rc][bf])
			contarVivas++;

		return (contarVivas);
	}

	public int getColumnaIzquierda(int columna) {
		int lc;
		int maxColumna = this.maxColumna;
		if (columna == 0) {
			lc = maxColumna;
		} else {
			lc = columna - 1;
		}
		return (lc);
	}

	public int getColumnaDerecha(int columna) {
		int rc;
		int maxColumna = this.maxColumna;
		if (columna == maxColumna) {
			rc = 0;
		} else {
			rc = columna + 1;
		}
		return (rc);
	}

	public int getFilaArriba(int fila) {
		int maxFila = this.maxFila;
		int tf;
		if (fila == 0) {
			tf = maxFila;
		} else {
			tf = fila - 1;
		}
		return (tf);
	}

	public int getFilaAbajo(int fila) {
		int maxFila = this.maxFila;
		int bf;
		if (fila == maxFila) {
			bf = 0;
		} else {
			bf = fila + 1;
		}
		return (bf);
	}

	public void nuevaVida() {

		for (fila = 0; fila < this.maxFila; fila++) {
			for (columna = 0; columna < this.maxColumna; columna++) {
				int vivo = celVivasAlrededor(fila, columna);
				if (tabla[columna][fila]==true && vivo <=1) {
					tn[columna][fila] = false; //MUERE
				}
				if (tabla[columna][fila]==true && vivo >= 4) {
					tn[columna][fila] = false;//MUERE
				}
				if (tabla[columna][fila]==true && vivo == 2) {
					// vive
					tn[columna][fila] = true;//VIVE
				}
				if (tabla[columna][fila]==true && vivo == 3) {
					tn[columna][fila] = true;//VIVE
				}
				if(tabla[columna][fila]==false && vivo==3) {
					tn[columna][fila] = true;//VIVE
				}

			}
		}
		for (fila = 0; fila < this.maxFila; fila++) {
			for (columna = 0; columna < this.maxColumna; columna++) {
				tabla[columna][fila] = tn[columna][fila];
			}
		}
	}
}

// debo hacer q la tabla de O o *
