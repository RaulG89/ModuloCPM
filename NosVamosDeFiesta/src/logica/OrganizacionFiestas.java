package logica;

import java.util.ArrayList;
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
	
	public boolean registrarCliente(Cliente cliente){
		if(clientes.containsKey(cliente.getNombre()))
			return false;
		GestionFicheros.guardarCliente(cliente);
		clientes = GestionFicheros.cargarClientes();
		return true;
	}
	
	public void recuperarCarrito(){
		reserva.setArticulos(reserva.getArticulosRecuperar());
	}
	
	public void vaciarCarrito(){
		reserva.setArticulosRecuperar(reserva.getArticulos());
		reserva.setArticulos(new ArrayList<Articulo>());
	}

	public boolean identificar(String nombre, String contraseña) {
		Cliente cliente = null;
		if (clientes.containsKey(nombre)){
			cliente = clientes.get(nombre);
			if (contraseña.equals(cliente.getContraseña())){
				reserva.setCliente(cliente);
				return true;
			}
		}
		return false;
	}
	

	
	
	

}
