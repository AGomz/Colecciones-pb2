package ar.edu.unlam.videoclub;

public abstract class Pelicula implements Alquilable{
	
	private String id;
	private String titulo;
	private String anio;
	private TipoPelicula tipo;

	public Pelicula(String id, String titulo, String anio, TipoPelicula tipo) {
		this.id = id;
		this.titulo = titulo;
		this.anio = anio;
		this.tipo = tipo;
	}

	public abstract TipoPelicula getTipo();
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}


}
