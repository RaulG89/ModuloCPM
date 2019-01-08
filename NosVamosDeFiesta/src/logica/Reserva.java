package logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

	public float calcularImporte() {
		float importe = 0;
		for (Articulo a : articulos){
			importe += a.getImporte(numPersonas);
		}	
		return importe;
	}
		
	@Override
	public String toString() {
		return "Reserva [tipoFiesta=" + tipoFiesta + ", descripcion=" + descripcion + ", numPersonas=" + numPersonas
				+ ", nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + ", fecha=" + fecha
				+ ", observacion=" + observacion + ", articulos=" + articulos + "]";
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
