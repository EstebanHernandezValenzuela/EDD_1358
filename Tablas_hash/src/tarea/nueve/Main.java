package tarea.nueve;

public class Main {
	 public static void main(String[] args) {
	        TablasHash tabla =new TablasHash(10);
	        tabla.Add(0, "Jose");
	        tabla.Add(0, "Maria");
	        tabla.Add(1, 1);
	        tabla.Add(4, "Hombre");
	        tabla.Add(7, "Mujer");
	        tabla.Add(7, "nina");
	        tabla.Add(4, "ninio");
	        tabla.Add(1, 2);
	        tabla.Add(1, 3);
	        tabla.Add(8, "Hola");
	      
	        System.out.println(tabla);
	     
}
}
