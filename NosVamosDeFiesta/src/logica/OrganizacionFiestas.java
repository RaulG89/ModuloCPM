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
	
	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
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
	
	public void inicializarReserva(Cliente cliente){
		reserva = new Reserva();
		reserva.setCliente(cliente);
	}
	
	public boolean identificarCliente(String nombre, String contraseña) {
		Cliente cliente = null;
		if (clientes.containsKey(nombre)){
			cliente = clientes.get(nombre);
			if (contraseña.equals(cliente.getContraseña())){
				inicializarReserva(cliente);
				reserva.setCliente(cliente);
				return true;
			}
		}
		return false;
	}

	public boolean registrarCliente(String nombre, String contraseña){
		if(clientes.containsKey(nombre))
			return false;
		
		Cliente cliente = new Cliente(nombre,contraseña);
		GestionFicheros.guardarCliente(cliente);
		inicializarReserva(cliente);
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

	public void configurarReserva(String tipoFiesta, String descripcion, int numPersonas) {
		if(reserva == null)	
			inicializarReserva(null);

		reserva.setTipoFiesta(tipoFiesta);
		reserva.setDescripcion(descripcion);
		reserva.setNumPersonas(numPersonas);
	}

	public void añadirArticuloReserva(Articulo articulo) {
		reserva.añadirArticulo(articulo);
		
	}
	
	

	
	
	

}
