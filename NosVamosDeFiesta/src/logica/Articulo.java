package logica;

import logica.tipos.TipoArticulo;

public class Articulo {

	private String codigo;
	private TipoArticulo tipo;
	private String denominacion;
	private String descripcion;
	private double precioUnidad;
	private double precioGrupo;
	private String foto;
	
	public Articulo(String codigo, TipoArticulo tipo, String denominacion, String descripcion, double precioUnidad,
			double precioGrupo) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.denominacion = denominacion;
		this.descripcion = descripcion;
		this.precioUnidad = precioUnidad;
		this.precioGrupo = precioGrupo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public TipoArticulo getTipo() {
		return tipo;
	}

	public void setTipo(TipoArticulo tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return denominacion;
	}

	public void setNombre(String nombre) {
		this.denominacion = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioUnidad() {
		return precioUnidad;
	}

	public void setPrecioUnidad(double precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	public double getPrecioGrupo() {
		return precioGrupo;
	}

	public void setPrecioGrupo(double precioGrupo) {
		this.precioGrupo = precioGrupo;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", tipo=" + tipo + ", nombre=" + denominacion + ", descripcion=" + descripcion
				+ ", precioUnidad=" + precioUnidad + ", precioGrupo=" + precioGrupo + ", foto=" + foto + "]";
	}
	
}
