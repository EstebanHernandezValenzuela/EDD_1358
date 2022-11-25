package laberinto.fes;
import laberinto.fes.Arreglo2D;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Archivo {
	/*public static void main(String[] args) {
		
	
	
	String archivo="C:\\Users\\popo\\OneDrive\\Escritorio\\ModLaberinto.txt";
	List<Arreglo2D> laberinto=new ArrayList<>();
	
	try (Stream<String> streamFile=Files.lines(Paths.get(archivo))){
		laberinto= streamFile.map(linea -> linea.split(",")).map(arreglo -> {
			Arreglo2D temp=new Arreglo2D(Integer.parseInt(arreglo[0]),Integer.parseInt(arreglo[1]));
			return temp;
		}).collect(Collectors.toList());
		
		laberinto.forEach(System.out::println);
	}catch (IOException io) {
		System.err.println("Error en archivo"+io.getMessage());
	}
}
		*/	

}

