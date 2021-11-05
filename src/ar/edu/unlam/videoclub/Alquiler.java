package ar.edu.unlam.videoclub;

public class Alquiler {

	private Pelicula pelicula;
	private Consola consola;
	private Cliente cliente;
	
	private String titulo;
	private String anio;
	private TipoPelicula tipoPelicula;
	private TipoConsola tipo;
	private String nombreYapellido;
	private Integer edad;
	
	/*private String idPelicula;
	private String idConsola;
	private String nroSocio;*/
	
	public Alquiler(String idPelicula, String idConsola, String nroSocio) {
		this.pelicula = new Pelicula(idPelicula, titulo, anio, tipoPelicula);
		this.consola = new Consola(idConsola, tipo);
		this.cliente = new Cliente(nroSocio, nombreYapellido, edad);
	
	}

	//Debe ir aca o en blockbuster
	public Boolean alquilarCondicionada() {
		Boolean seAlquilo = false;
		if(this.pelicula.getTipo().equals(TipoPelicula.CONDICIONADAS) && this.cliente.esMayorDeEdad()) {
			seAlquilo = true;
		}
		return seAlquilo;
	}
	
	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public Consola getConsola() {
		return consola;
	}

	public void setConsola(Consola consola) {
		this.consola = consola;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
