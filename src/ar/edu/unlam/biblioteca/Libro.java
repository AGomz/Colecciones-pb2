package ar.edu.unlam.biblioteca;

public class Libro {

	private String codigoLibro;
	private String nombreLibro;
	private String autor;
	private String editorial;
	private Integer cantidadDeCopias;
	private TipoNivel nivel;
	private String asignatura; //Para poder compararlo en el metodo fotocopiable
	
	public Libro(String codigoLibro, String nombreLibro, String autor, String editorial, Integer cantidadDeCopias, TipoNivel nivel) {
		this.codigoLibro = codigoLibro;
		this.nombreLibro = nombreLibro;
		this.autor = autor;
		this.editorial = editorial;
		this.cantidadDeCopias = cantidadDeCopias; //O debería ir fuera del constructor
		this.nivel = nivel;
	}
	
	public String getCodigoLibro() {
		return codigoLibro;
	}
	public void setCodigoLibro(String codigoLibro) {
		this.codigoLibro = codigoLibro;
	}
	public String getNombreLibro() {
		return nombreLibro;
	}
	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public Integer getCantidadDeCopias() {
		return cantidadDeCopias;
	}
	public void setCantidadDeCopias(Integer cantidadDeCopias) {
		this.cantidadDeCopias = cantidadDeCopias;
	}

	public TipoNivel getNivel() {
		return nivel;
	}

	public void setNivel(TipoNivel nivel) {
		this.nivel = nivel;
	}
	
}
