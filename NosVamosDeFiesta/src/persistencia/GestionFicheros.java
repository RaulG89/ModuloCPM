package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import logica.Articulo;
import logica.Cliente;
import logica.Reserva;
import logica.tipos.TipoArticulo;

public class GestionFicheros {

	public static BufferedReader br;
	public static BufferedWriter bw;
	private static final String FICHERO_FIESTA = "files/fiesta.txt";
	private static final String FICHERO_CLIENTES = "files/clientes.dat";
	
	
	public static HashMap<String, Articulo> cargarArticulos() {
		List<String> lines = leerFichero(FICHERO_FIESTA);
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
	
	public static HashMap<String, Cliente> cargarClientes() {
		List<String> lines = leerFichero(FICHERO_CLIENTES);
		HashMap<String, Cliente> clientes = new HashMap<>();
		for (String line : lines) {
			String[] data = line.split("@");
			String nombre = data[0];
			String contraseña = data[1];
			Cliente cliente = new Cliente(nombre, contraseña);
			clientes.put(cliente.getNombre(), cliente);
		}
		return clientes;
	}

	private static List<String> leerFichero(String file) {
		List<String> lines = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(file));
			while (br.ready()) {
				lines.add(br.readLine());
			}
		} catch (FileNotFoundException e) {
			System.out
					.println("El fichero " + file + " no se ha encontrado.");
		} catch (IOException e) {
			new RuntimeException(
					"Error de entrada/salida con el fichero " + file + ".");
		}
		return lines;
	}
	
	public static void guardarCliente(Cliente cliente) {
		try {
			bw = new BufferedWriter(new FileWriter(FICHERO_CLIENTES));
			bw.write(cliente.getNombre() + "@" + cliente.getContraseña());
			bw.newLine();
			bw.close();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero " + FICHERO_CLIENTES + " no se ha encontrado.");
		} catch (IOException e) {
			new RuntimeException("Error de entrada/salida con el fichero " + FICHERO_CLIENTES + ".");
		}

	}
	
	public static void guardarFactura(Reserva reserva) {
		try {
			bw = new BufferedWriter(new FileWriter("" + reserva.getNif() + reserva.getFecha()));
			bw.newLine();
			bw.write(reserva.toString());
			bw.close();
		} catch (IOException e) {
			new RuntimeException("Error de entrada/salida con el fichero de reserva.");
		}
	}

	
}
