package persistencia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import logica.Articulo;
import logica.tipos.TipoArticulo;

public class GestionFicheros {

	public static BufferedReader b;
	private static final String FIESTA_FILE = "files/fiesta.txt";

	public static HashMap<String, Articulo> cargarDatos() {
		List<String> lines = readFile(FIESTA_FILE);
		HashMap<String, Articulo> productos = new HashMap<>();
		for (String line : lines) {
			String[] data = line.split("@");
			String cod = data[0];
			TipoArticulo tipo = TipoArticulo.valueOf(data[1]);
			String nombre = data[2];
			String descripcion = data[3];
			float precioIndividual = Float.parseFloat(data[4]);
			float precioGrupo = Float.parseFloat(data[5]);
			Articulo producto = 
					new Articulo(cod, tipo, nombre, descripcion,
							precioIndividual, precioGrupo);
			productos.put(producto.getCodigo(), producto);
		}
		return productos;
	}

	private static List<String> readFile(String file) {
		List<String> lines = new ArrayList<>();
		try {
			b = new BufferedReader(new FileReader(file));
			while (b.ready()) {
				lines.add(b.readLine());
			}
		} catch (FileNotFoundException e) {
			System.out
					.println("El archivo fichero " + file + " no se encontro");
		} catch (IOException e) {
			new RuntimeException(
					"Error de entrada/salida con el fichero " + file);
		}
		return lines;
	}

	
}
