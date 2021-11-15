package ar.edu.unlam.videoclub;

public class Alquiler {
	
	private String idPelicula;
	private String idConsola;
	private String nroSocio;
	
	public Alquiler(String idPelicula, String idConsola, String nroSocio) {
		this.idPelicula = idPelicula;
		this.idConsola = idConsola;
		this.nroSocio = nroSocio;
	}

	public String getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(String idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getIdConsola() {
		return idConsola;
	}

	public void setIdConsola(String idConsola) {
		this.idConsola = idConsola;
	}

	public String getNroSocio() {
		return nroSocio;
	}

	public void setNroSocio(String nroSocio) {
		this.nroSocio = nroSocio;
	}
	
}
