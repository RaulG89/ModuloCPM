package logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import logica.tipos.TipoArticulo;

public class Reserva {

	private Cliente cliente;
	private String tipoFiesta;
	private String descripcion;
	private int numPersonas;
	private String nombre;
	private String apellidos;
	private String nif;
	private Date fecha;
	private String observacion;
	private String telefono;

	private List<Articulo> articulos = new ArrayList<Articulo>();
	private List<Articulo> articulosRecuperar = new ArrayList<Articulo>();

	public Reserva() { }

	public Reserva(String tipoFiesta, String descripcion, int numPersonas) {
		super();
		this.tipoFiesta = tipoFiesta;
		this.descripcion = descripcion;
		this.numPersonas = numPersonas;
	}
	
	public Reserva(Cliente cliente, String tipoFiesta, String descripcion, int numPersonas) {
		this(tipoFiesta, descripcion, numPersonas);
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getTipoFiesta() {
		return tipoFiesta;
	}

	public void setTipoFiesta(String tipoFiesta) {
		this.tipoFiesta = tipoFiesta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getNumPersonas() {
		return numPersonas;
	}

	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}
	
	public List<Articulo> getArticulosRecuperar() {
		return articulosRecuperar;
	}

	public void setArticulosRecuperar(List<Articulo> articulosRecuperar) {
		this.articulosRecuperar = articulosRecuperar;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public float calcularImporte() {
		float importe = 0;
		for (Articulo a : articulos){
			importe += a.getImporte(numPersonas);
		}	
		return importe;
	}
		
	@SuppressWarnings("deprecation")
	@Override
	public String toString() {
		String fechaFiesta = "" + fecha.getDate() + "/"
				+ (fecha.getMonth()) + "/"
				+ (fecha.getYear());
		String bebidas = "Bebida:\n";
		String comidas = "Comida:\n";
		String decoraciones = "Decoración:\n";
		String locales = "Local:\n";
		String otros = "Otros:\n";
		
		for(Articulo a: articulos){
			if(a.getTipo().equals(TipoArticulo.Bebida))
				bebidas += "* " + a.getDenominacion() + " / " + a.getCodigo() + " / " + a.getUnidades() + " / " + a.getImporte(numPersonas) + "\n";
			if(a.getTipo().equals(TipoArticulo.Comida))
				comidas += "* " + a.getDenominacion() + " / " + a.getCodigo() + " / " + a.getUnidades() + " / " + a.getImporte(numPersonas) + "\n";
			if(a.getTipo().equals(TipoArticulo.Decoración))
				decoraciones += "* " + a.getDenominacion() + " / " + a.getCodigo() + " / " + a.getUnidades() + " / " + a.getImporte(numPersonas) + "\n";
			if(a.getTipo().equals(TipoArticulo.Local))
				locales += "* " + a.getDenominacion() + " / " + a.getCodigo() + " / " + a.getUnidades() + " / " + a.getImporte(numPersonas)+ "\n";
			if(a.getTipo().equals(TipoArticulo.Otros))
				otros += "* " + a.getDenominacion() + " / " + a.getCodigo() + " / " + a.getUnidades() + " / " + a.getImporte(numPersonas)+ "\n";
		}

		StringBuilder sb = new StringBuilder();
		sb.append("FACTURA FIESTA\n");
		sb.append("--------------\n");
		sb.append("** CLIENTE: " + nombre + " " + apellidos + " ");
		if(cliente != null)
			sb.append("(CLIENTE REGISTRADO: " + cliente.getNombre() + ")");
		sb.append("\n");
		sb.append("** NIF: " + nif + "\n");
		sb.append("** FECHA Y HORA FIESTA: " + fechaFiesta + " a las " + fecha.getHours() + ":" + fecha.getMinutes() + "\n");
		sb.append("** NUMERO PERSONAS: " + numPersonas + "\n");
		sb.append("\n");
		sb.append("RELACIÓN ARTÍCULOS: DENOMINACIÓN / CÓDIGO / UNIDADES / TOTAL ARTÍCULO\n");
		sb.append("----------------------------------------------------------------------\n");
		sb.append(bebidas);
		sb.append(comidas);
		sb.append(decoraciones);
		sb.append(locales);
		sb.append(otros);
		sb.append("\n");
		sb.append("OBSERVACIONES\n");
		sb.append("-------------\n");
		sb.append("" + observacion + "\n");
		sb.append("\n");
		if(cliente != null)
			sb.append("TOTAL FACTURA CON DESCUENTO CLIENTE: " + calcularImporte() + " – (15% de "+ calcularImporte() +") = " + calcularImporte() * 0.85 +" €\n");
		else
			sb.append("TOTAL FACTURA: " + calcularImporte() + " €\n");
		
		return sb.toString();
	}

	public void añadirArticulo(Articulo articulo) {
		if(articulos.contains(articulo)){
			int unidadesAnteriores = articulos.get(articulos.indexOf(articulo)).getUnidades();
			articulos.remove(articulo);
			articulo.setUnidades(articulo.getUnidades() + unidadesAnteriores);
			articulos.add(articulo);
			
		}else
			articulos.add(articulo);
	}

	public void eliminarArticulo(Articulo articulo) {
		articulos.remove(articulo);		
	}

		
}
