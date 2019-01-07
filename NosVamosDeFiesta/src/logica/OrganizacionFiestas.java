package logica;

import java.util.HashMap;

import persistencia.GestionFicheros;

public class OrganizacionFiestas {
	
	private Reserva reserva;
	private HashMap<String, Articulo> articulos;
	private HashMap<String, Cliente> clientes;
	
	public OrganizacionFiestas() {
		articulos = GestionFicheros.cargarArticulos();
		clientes = GestionFicheros.cargarClientes();
	}

	public HashMap<String, Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(HashMap<String, Articulo> articulos) {
		this.articulos = articulos;
	}

	public HashMap<String, Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(HashMap<String, Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public void inicializarReserva(){
		reserva = new Reserva();
	}
	
	public void registrarCliente(Cliente cliente){
		GestionFicheros.guardarCliente(cliente);
		clientes = GestionFicheros.cargarClientes();
	}
	

	
	
	

}
