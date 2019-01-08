package logica;

import logica.tipos.TipoArticulo;

public class Articulo {

	private String codigo;
	private TipoArticulo tipo;
	private String denominacion;
	private String descripcion;
	private float precioUnidad;
	private float precioGrupo;
	private String foto;
	
	private int unidades;
	private boolean grupo;
	
	public Articulo(String codigo, TipoArticulo tipo, String denominacion, String descripcion, float precioUnidad,
			float precioGrupo, boolean grupo) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.denominacion = denominacion;
		this.descripcion = descripcion;
		this.precioUnidad = precioUnidad;
		this.precioGrupo = precioGrupo;
		this.grupo = grupo;
		foto = "/img/" + codigo + ".jpg";
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

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}


	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecioUnidad() {
		return precioUnidad;
	}

	public void setPrecioUnidad(float precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	public float getPrecioGrupo() {
		return precioGrupo;
	}

	public void setPrecioGrupo(float precioGrupo) {
		this.precioGrupo = precioGrupo;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public boolean isGrupo() {
		return grupo;
	}

	public void setGrupo(boolean grupo) {
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", tipo=" + tipo + ", nombre=" + denominacion + ", descripcion=" + descripcion
				+ ", precioUnidad=" + precioUnidad + ", precioGrupo=" + precioGrupo + ", foto=" + foto + "]";
	}

	public float getImporte(int numPersonas) {
		if (isGrupo())
			return getPrecioGrupo(numPersonas);
		return precioUnidad * unidades;
	}
	
	private float getPrecioGrupo(int numpersonas) {
		float tamañoGrupo = numpersonas;
		while(tamañoGrupo%10!=0) {
			tamañoGrupo++;
		}
		return precioGrupo * (tamañoGrupo/10);
	}
	
}
